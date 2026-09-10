public class PicaretaFerro extends Picareta {
    public PicaretaFerro(int durabilidade, int forca) {
        super(durabilidade, forca, 100);
    }

    @Override
    public String getMaterial() {
        return "ferro";
    }
}