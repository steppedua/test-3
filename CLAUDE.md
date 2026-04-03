# Agent Platform Project

This is an Agent Platform project exported as a file structure.
All YAML files use **kebab-case** field naming.

## Project Info

- Schema version: `1.0`
- Project key: `asdfa-1000001-Rnl`
- Language: `ru`
- Engine version: `1`

## Documentation

Detailed format documentation is in `.agent/rules/`:

- [Project Structure](.agent/rules/project-structure.md) — directory layout and file locations
- [Node Types](.agent/rules/node-types.md) — all node types and their YAML fields
- [Functions Format](.agent/rules/functions-format.md) — user function schema.yml and code.js
- [Integrations Format](.agent/rules/integrations-format.md) — integration YAML formats

### System Functions

JSON Schemas for available system functions are in `.agent/rules/system-functions/`:

- `Context/getAccountId` — [schema](.agent/rules/system-functions/Context/getAccountId.json)
- `Context/getProjectShortName` — [schema](.agent/rules/system-functions/Context/getProjectShortName.json)
- `Context/getBotId` — [schema](.agent/rules/system-functions/Context/getBotId.json)
- `Context/getChannelType` — [schema](.agent/rules/system-functions/Context/getChannelType.json)
- `Context/isAsyncChannel` — [schema](.agent/rules/system-functions/Context/isAsyncChannel.json)
- `Context/isTestChannel` — [schema](.agent/rules/system-functions/Context/isTestChannel.json)
- `Context/getRequestId` — [schema](.agent/rules/system-functions/Context/getRequestId.json)
- `Context/getMessageContent` — [schema](.agent/rules/system-functions/Context/getMessageContent.json)
- `Context/getChatId` — [schema](.agent/rules/system-functions/Context/getChatId.json)
- `Context/getSessionId` — [schema](.agent/rules/system-functions/Context/getSessionId.json)
- `Context/getClientInfo` — [schema](.agent/rules/system-functions/Context/getClientInfo.json)
- `Context/getRawRequest` — [schema](.agent/rules/system-functions/Context/getRawRequest.json)
- `Context/getLastFunctionResult` — [schema](.agent/rules/system-functions/Context/getLastFunctionResult.json)
- `Context/getChatHistory` — [schema](.agent/rules/system-functions/Context/getChatHistory.json)
- `Context/getEmailContent` — [schema](.agent/rules/system-functions/Context/getEmailContent.json)
- `Credentials/get` — [schema](.agent/rules/system-functions/Credentials/get.json)
- `Db/get` — [schema](.agent/rules/system-functions/Db/get.json)
- `Db/findByFilters` — [schema](.agent/rules/system-functions/Db/findByFilters.json)
- `Db/countByFilters` — [schema](.agent/rules/system-functions/Db/countByFilters.json)
- `Db/put` — [schema](.agent/rules/system-functions/Db/put.json)
- `Db/delete` — [schema](.agent/rules/system-functions/Db/delete.json)
- `Db/deleteByFilters` — [schema](.agent/rules/system-functions/Db/deleteByFilters.json)
- `Db/updateByFilters` — [schema](.agent/rules/system-functions/Db/updateByFilters.json)
- `Email/send` — [schema](.agent/rules/system-functions/Email/send.json)
- `Http/get` — [schema](.agent/rules/system-functions/Http/get.json)
- `Http/post` — [schema](.agent/rules/system-functions/Http/post.json)
- `Http/put` — [schema](.agent/rules/system-functions/Http/put.json)
- `Http/delete` — [schema](.agent/rules/system-functions/Http/delete.json)
- `Http/patch` — [schema](.agent/rules/system-functions/Http/patch.json)
- `Http/send` — [schema](.agent/rules/system-functions/Http/send.json)
- `Llm/sendRequest` — [schema](.agent/rules/system-functions/Llm/sendRequest.json)
- `Llm/sendText` — [schema](.agent/rules/system-functions/Llm/sendText.json)
- `Llm/getChatHistory` — [schema](.agent/rules/system-functions/Llm/getChatHistory.json)
- `Llm/summarizeText` — [schema](.agent/rules/system-functions/Llm/summarizeText.json)
- `Rag/retrieveChunks` — [schema](.agent/rules/system-functions/Rag/retrieveChunks.json)
- `Rag/generateAnswer` — [schema](.agent/rules/system-functions/Rag/generateAnswer.json)
- `Reactions/sendText` — [schema](.agent/rules/system-functions/Reactions/sendText.json)
- `Reactions/sendHtml` — [schema](.agent/rules/system-functions/Reactions/sendHtml.json)
- `Reactions/sendAudio` — [schema](.agent/rules/system-functions/Reactions/sendAudio.json)
- `Reactions/sendImage` — [schema](.agent/rules/system-functions/Reactions/sendImage.json)
- `Reactions/sendVideo` — [schema](.agent/rules/system-functions/Reactions/sendVideo.json)
- `Reactions/sendFile` — [schema](.agent/rules/system-functions/Reactions/sendFile.json)
- `Reactions/sendLocation` — [schema](.agent/rules/system-functions/Reactions/sendLocation.json)
- `Reactions/sendRawRequest` — [schema](.agent/rules/system-functions/Reactions/sendRawRequest.json)
- `SessionDb/get` — [schema](.agent/rules/system-functions/SessionDb/get.json)
- `SessionDb/findByFilters` — [schema](.agent/rules/system-functions/SessionDb/findByFilters.json)
- `SessionDb/countByFilters` — [schema](.agent/rules/system-functions/SessionDb/countByFilters.json)
- `SessionDb/put` — [schema](.agent/rules/system-functions/SessionDb/put.json)
- `SessionDb/delete` — [schema](.agent/rules/system-functions/SessionDb/delete.json)
- `SessionDb/deleteByFilters` — [schema](.agent/rules/system-functions/SessionDb/deleteByFilters.json)
- `SessionDb/updateByFilters` — [schema](.agent/rules/system-functions/SessionDb/updateByFilters.json)
- `Telegram/sendText` — [schema](.agent/rules/system-functions/Telegram/sendText.json)
- `Telegram/sendImage` — [schema](.agent/rules/system-functions/Telegram/sendImage.json)
- `Telegram/sendAudio` — [schema](.agent/rules/system-functions/Telegram/sendAudio.json)
- `Telegram/sendVoice` — [schema](.agent/rules/system-functions/Telegram/sendVoice.json)
- `Telegram/sendButtons` — [schema](.agent/rules/system-functions/Telegram/sendButtons.json)
- `AgentContext/addNote` — [schema](.agent/rules/system-functions/AgentContext/addNote.json)
- `AgentContext/getNotes` — [schema](.agent/rules/system-functions/AgentContext/getNotes.json)
- `AgentContext/deleteNotes` — [schema](.agent/rules/system-functions/AgentContext/deleteNotes.json)
- `AgentContext/putValue` — [schema](.agent/rules/system-functions/AgentContext/putValue.json)
- `AgentContext/getValue` — [schema](.agent/rules/system-functions/AgentContext/getValue.json)
- `AgentContext/deleteValue` — [schema](.agent/rules/system-functions/AgentContext/deleteValue.json)
- `AgentContext/clearContext` — [schema](.agent/rules/system-functions/AgentContext/clearContext.json)
- `Asr/recognize` — [schema](.agent/rules/system-functions/Asr/recognize.json)
- `ProjectRouter/callProject` — [schema](.agent/rules/system-functions/ProjectRouter/callProject.json)
- `ProjectRouter/switchTo` — [schema](.agent/rules/system-functions/ProjectRouter/switchTo.json)
- `ProjectRouter/backToOriginalProject` — [schema](.agent/rules/system-functions/ProjectRouter/backToOriginalProject.json)
- `ProjectRouter/getCustomData` — [schema](.agent/rules/system-functions/ProjectRouter/getCustomData.json)
- `Tts/synthesize` — [schema](.agent/rules/system-functions/Tts/synthesize.json)
- `Log/info` — [schema](.agent/rules/system-functions/Log/info.json)
- `Log/debug` — [schema](.agent/rules/system-functions/Log/debug.json)
- `Log/trace` — [schema](.agent/rules/system-functions/Log/trace.json)
- `Log/warn` — [schema](.agent/rules/system-functions/Log/warn.json)
- `Log/error` — [schema](.agent/rules/system-functions/Log/error.json)

### MCP Functions

JSON Schemas for MCP tool functions are in `.agent/rules/mcp-functions/`:

- `afsa/add` — [schema](.agent/rules/mcp-functions/afsa/add.json)
- `afsa/subtract` — [schema](.agent/rules/mcp-functions/afsa/subtract.json)
- `afsa/multiply` — [schema](.agent/rules/mcp-functions/afsa/multiply.json)
- `afsa/division` — [schema](.agent/rules/mcp-functions/afsa/division.json)
- `afsa/sum` — [schema](.agent/rules/mcp-functions/afsa/sum.json)
- `afsa/modulo` — [schema](.agent/rules/mcp-functions/afsa/modulo.json)
- `afsa/mean` — [schema](.agent/rules/mcp-functions/afsa/mean.json)
- `afsa/median` — [schema](.agent/rules/mcp-functions/afsa/median.json)
- `afsa/mode` — [schema](.agent/rules/mcp-functions/afsa/mode.json)
- `afsa/min` — [schema](.agent/rules/mcp-functions/afsa/min.json)
- `afsa/max` — [schema](.agent/rules/mcp-functions/afsa/max.json)
- `afsa/floor` — [schema](.agent/rules/mcp-functions/afsa/floor.json)
- `afsa/ceiling` — [schema](.agent/rules/mcp-functions/afsa/ceiling.json)
- `afsa/round` — [schema](.agent/rules/mcp-functions/afsa/round.json)
- `afsa/sin` — [schema](.agent/rules/mcp-functions/afsa/sin.json)
- `afsa/arcsin` — [schema](.agent/rules/mcp-functions/afsa/arcsin.json)
- `afsa/cos` — [schema](.agent/rules/mcp-functions/afsa/cos.json)
- `afsa/arccos` — [schema](.agent/rules/mcp-functions/afsa/arccos.json)
- `afsa/tan` — [schema](.agent/rules/mcp-functions/afsa/tan.json)
- `afsa/arctan` — [schema](.agent/rules/mcp-functions/afsa/arctan.json)
- `afsa/radiansToDegrees` — [schema](.agent/rules/mcp-functions/afsa/radiansToDegrees.json)
- `afsa/degreesToRadians` — [schema](.agent/rules/mcp-functions/afsa/degreesToRadians.json)
- `sdas/add` — [schema](.agent/rules/mcp-functions/sdas/add.json)
- `sdas/subtract` — [schema](.agent/rules/mcp-functions/sdas/subtract.json)
- `sdas/multiply` — [schema](.agent/rules/mcp-functions/sdas/multiply.json)
- `sdas/division` — [schema](.agent/rules/mcp-functions/sdas/division.json)
- `sdas/sum` — [schema](.agent/rules/mcp-functions/sdas/sum.json)
- `sdas/modulo` — [schema](.agent/rules/mcp-functions/sdas/modulo.json)
- `sdas/mean` — [schema](.agent/rules/mcp-functions/sdas/mean.json)
- `sdas/median` — [schema](.agent/rules/mcp-functions/sdas/median.json)
- `sdas/mode` — [schema](.agent/rules/mcp-functions/sdas/mode.json)
- `sdas/min` — [schema](.agent/rules/mcp-functions/sdas/min.json)
- `sdas/max` — [schema](.agent/rules/mcp-functions/sdas/max.json)
- `sdas/floor` — [schema](.agent/rules/mcp-functions/sdas/floor.json)
- `sdas/ceiling` — [schema](.agent/rules/mcp-functions/sdas/ceiling.json)
- `sdas/round` — [schema](.agent/rules/mcp-functions/sdas/round.json)
- `sdas/sin` — [schema](.agent/rules/mcp-functions/sdas/sin.json)
- `sdas/arcsin` — [schema](.agent/rules/mcp-functions/sdas/arcsin.json)
- `sdas/cos` — [schema](.agent/rules/mcp-functions/sdas/cos.json)
- `sdas/arccos` — [schema](.agent/rules/mcp-functions/sdas/arccos.json)
- `sdas/tan` — [schema](.agent/rules/mcp-functions/sdas/tan.json)
- `sdas/arctan` — [schema](.agent/rules/mcp-functions/sdas/arctan.json)
- `sdas/radiansToDegrees` — [schema](.agent/rules/mcp-functions/sdas/radiansToDegrees.json)
- `sdas/degreesToRadians` — [schema](.agent/rules/mcp-functions/sdas/degreesToRadians.json)

## Rules

- Do NOT modify `manifest.yml` unless you know what you are doing.
- Node IDs must be unique across the entire project.
- `next-step` fields reference other node IDs to define the execution flow.
- Agent node `tools` list references node IDs of function/code nodes that are available as tools.
- Function code is always in JavaScript and stored in separate `.js` files.
- Credentials contain only metadata (type, key, name) — actual secrets are never stored in files.
