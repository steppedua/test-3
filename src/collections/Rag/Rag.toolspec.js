import functions from './Rag.js';

export default {
  retrieveChunks__e2a5e57f: {
    description: "Retrieves relevant chunks from a RAG integration based on a query",
    parameters: {
      "type" : "object",
      "properties" : {
        "query" : {
          "type" : "string",
          "description" : "The search query text"
        },
        "historyMessageLimit" : {
          "type" : "integer",
          "description" : "The maximum number of recent messages from the dialogue history."
        }
      },
      "required" : [ "query" ]
    },
    function: functions.retrieveChunks__e2a5e57f
  },
};
