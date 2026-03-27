import functions from './Email.js';

export default {
  send__bc368a0b: {
    description: "Sends an email using the specified SMTP integration",
    parameters: {
      "type" : "object",
      "properties" : {
        "recipients" : {
          "type" : "array",
          "description" : "Email address(es) of the recipient(s)",
          "items" : {
            "type" : "string",
            "description" : ""
          }
        },
        "content" : {
          "type" : "string",
          "description" : "Email body content (HTML supported)"
        }
      },
      "required" : [ "recipients", "content" ]
    },
    function: functions.send__bc368a0b
  },
};
