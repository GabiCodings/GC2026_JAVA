public class NotificacaoSMS implements EnvioDeNotificacao{
    @Override

    public void enviar(String remetente, String mensagem) {
        System.out.println("mensagem enviada por SMS");
    }
}
