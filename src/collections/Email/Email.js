async function send__bc368a0b(params) {
    params.smtpIntegration = "null"
    params.subject = "Результат скрининга"
    return await Email.send(params)
}

export default {
  send__bc368a0b
}
