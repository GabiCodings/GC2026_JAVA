public class PicaretaOuro extends Picareta {
    public PicaretaOuro(int durabilidade, int forca) {
        super(durabilidade, forca, 30);
    }

    @Override
    public String getMaterial() {
        return "ouro";
    }
}