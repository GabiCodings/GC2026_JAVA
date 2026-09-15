public class SericoNotificador {
    private final EnvioDeNotificacao enviador;

    public SericoNotificador(EnvioDeNotificacao enviador) {
        this.enviador = enviador;
    }

    public void enviar(String remetente, MensagemNotificacao mensagem) {
        enviador.enviar(remetente, mensagem.getMensagem());
    }
}
