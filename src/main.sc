require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        script: $jsapi.startSession();
        a: Привет! я бот-помощник, который поможет тебе подобрать обучение по продуктам компании Just AI.
        buttons:
            "Подобрать обучение" -> /AiAgent

    state: AiAgent
        q!: Подобрать обучение
        AIAgent: 
            id = educationAssistant
            model = gpt-4o
            temperature = 0.8
            topP = 1
            maxTokens = 4000
            role = Агент по продаже обучения по продуктам Just AI
            goal = Собрать информацию для каких продуктов нужно обучение, дата начала обучения, сколько человек участвуют в обучении и какой у них уровень подготовки.
            instructions = Отвечай на языке пользователя. В конце уточни корректность введенных данных от пользователя. В начале уточни, что требует пользователь
            nextState = /Bye
            requiredData = 
                [
                      {
                          "name":"products",
                          "type":"string",
                          "description":"Интересующие продукты",
                          "reasonForQuestion":"Для подбора обучения нужно знать, по какому продукту оно нужно"
                      },
                      {
                          "name":"startDate",
                          "type":"string",
                          "description":"Желаемая дата начала обучения"
                      },
                      {
                          "name":"participantsNumber",
                          "type":"number",
                          "description":"Количество участников обучения"
                      },
                      {
                          "name":"participantsLevel",
                          "type":"string",
                          "description":"Уровень подготовки участников перед курсом"
                      }
                ]
            
            
    state: Bye
        script:
            $client.trainingInfo = $session.llmContext.userData;
        a: Сохранил данные об обучении. В ближайшее время с вами свяжется наш специалист, чтобы обсудить детали.
        a: До свидания!
        buttons:
            "Начать сначала" -> /Start

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}