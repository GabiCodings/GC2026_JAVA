public class PicaretaMadeira extends Picareta {
    public PicaretaMadeira(int durabilidade, int forca) {
        super(durabilidade, forca, 50);
    }

    @Override
    public String getMaterial() {
        return "madeira";
    }
}