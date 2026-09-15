//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MensagemNotificacao mensagem = new MensagemNotificacao(("oi fofis"));

        EnvioDeNotificacao email = new NotificacaoEmail();
        SericoNotificador emailService = new SericoNotificador(email);
        emailService.enviar("pedrovalerio@gemail", mensagem);

        EnvioDeNotificacao sms = new NotificacaoSMS();
        SericoNotificador smsService = new SericoNotificador(sms);
        smsService.enviar("93489349", mensagem);
    }
}
