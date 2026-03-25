theme: /
    # metainfo: {"nodeName":"Составитель анкеты","nodeType":"AgentNode"}
    state: state_Agent1
        AIAgent2:
            id = Составитель анкеты
            llmModelKey = 1000001-open_ai_gpt41-ixy
            temperature = 0.68
            topP = 0.14
            frequencyPenalty = 0.09
            presencePenalty = 0.09
            maxTokens = 4000
            role = Собиратель анкеты для обзвона
            goal = Собрать данные для дальнейшего обзвона
            instructions =
                Задай следующие вопросы:
                1) На какую позицию собеседуем?
                2) Кто точно не подходит? 
                3) Email для отправки отчёта
                4) Опыт работы
                5) Какие зарплатные ожидания?  
                6) Какие ещё вопросы нужно задать кандидату?
            queryOverride = 
            functions = {}
            chatHistoryEnabled = true
            chatHistoryLimit = 50
            sequentialToolCallsLimit = 5
            knowledgeBase = 
            knowledgeBaseConfidence = 0.8
            includeListOfAgents = []
            excludeListOfAgents = []
            verboseMode = true
            stayInAgent = true
            enableContext = true
            nextState = /
            telephonyConfig = {"enabled":false,"bargeInConfig":{"bargeIn":"DISABLED","bargeInTrigger":"FINAL"},"fillersPhraseConfig":{"fillerPhrasesList":[]}}

    # metainfo: {"nodeName":"Рекрутер-обзвонщик","nodeType":"AgentNode"}
    state: state_Agent2
        AIAgent2:
            id = Рекрутер-обзвонщик
            llmModelKey = 1000001-open_ai_gpt41-ixy
            temperature = 0.7
            topP = 0.22
            frequencyPenalty = 0.1
            presencePenalty = 0.1
            maxTokens = 1000
            role =
                Ты — HR-ассистент, который проводит телефонное первичное интервью с кандидатом. Ты вежливый, структурированный, задаёшь вопросы по заранее заданному списку, умеешь кратко отвечать и поддерживать диалог.
                
            goal =
                Провести собеседование по телефону: задать обязательные вопросы, зафиксировать ответы, корректно реагировать на перебивания, довести интервью до логического завершения.
                
            instructions =
                1. Начни с приветствия и уточнения готовности кандидата.
                2. Задавай вопросы по списку (или из словаря вакансии).
                3. Формулируй реплики коротко, простыми предложениями.
                4. Если кандидат перебивает, учитывай это и корректируй ответ.
                5. Используй системные фразы: speechNotRecognized, bargeIn, endPhrase.
                5. Заверши интервью прощальной фразой (endPhrase).
                
                По завершении разговора отправь отчёт на указанную пользователем электронную почту с указанием — подходит кандидат или нет, приложи краткое саммари созвона, выдели ключевые плюсы и минусы кандидата. 
            queryOverride = 
            functions = {"retrieveChunks__e2a5e57f":{"location":"../../../../collections/Rag/Rag.toolspec.js","name":"retrieveChunks__e2a5e57f"},"send__bc368a0b":{"location":"../../../../collections/Email/Email.toolspec.js","name":"send__bc368a0b"}}
            chatHistoryEnabled = true
            chatHistoryLimit = 50
            sequentialToolCallsLimit = 5
            knowledgeBase = 
            knowledgeBaseConfidence = 0.8
            includeListOfAgents = []
            excludeListOfAgents = []
            verboseMode = true
            stayInAgent = false
            enableContext = true
            nextState = /
            telephonyConfig = {"enabled":false,"bargeInConfig":{"bargeIn":"DISABLED","bargeInTrigger":"FINAL"},"fillersPhraseConfig":{"fillerPhrasesList":[]}}

    # metainfo: {"nodeName":"Условие","nodeType":"ConditionNode"}
    state: state_condition
        scriptEs6:
            if (Context.getChannelType() == "telegram") {
                Reactions.transition("/state_Agent1")
            } else {
                Reactions.transition("/state_Agent2")
            }

    # metainfo: {"nodeName":"Сообщение","nodeType":"MessageTriggerNode"}
    state: state_MessageTrigger
        q!: *
        event!: fileEvent
        event!: locationEvent
        event!: contactEvent
        event!: stickerEvent
        go!: /state_condition