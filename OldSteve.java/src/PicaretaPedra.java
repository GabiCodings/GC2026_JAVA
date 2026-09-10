public class PicaretaPedra extends Picareta {
    public PicaretaPedra(int durabilidade, int forca) {
        super(durabilidade, forca, 70);
    }

    @Override
    public String getMaterial() {
        return "pedra";
    }
}