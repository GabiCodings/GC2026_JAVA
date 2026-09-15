public class MensagemNotificacao {
    private final String mensagem;

    public MensagemNotificacao(String mensagem) {
        if(mensagem.isBlank()) {
            throw new IllegalArgumentException("Mensagem nao pode estar enviada");
        }

        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}
