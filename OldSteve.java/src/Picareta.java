public abstract class Picareta {
    private int durabilidade;
    private final int durabilidadeMaxima;
    private final int forca;

    protected Picareta(int durabilidadeInicial, int forca, int durabilidadeMaxima) {
        if (durabilidadeInicial <= 0 || forca <= 0) {
            throw new IllegalArgumentException("Picareta inválida!");
        }
        this.durabilidade = Math.min(durabilidadeInicial, durabilidadeMaxima);
        this.forca = forca;
        this.durabilidadeMaxima = durabilidadeMaxima;

        System.out.println("\n=== FABRICANDO PICARETA ===");
        System.out.println("Material: " + getMaterial());
        System.out.println("Durabilidade: " + this.durabilidade);
        System.out.println("Força: " + forca);
        System.out.println("Picareta de " + getMaterial() + " fabricada com sucesso!");
    }

    public abstract String getMaterial();

    public boolean estaQuebrada() {
        return durabilidade <= 0;
    }

    public int minerar(int blocos) {
        System.out.println("\n=== MINERANDO COM PICARETA DE " + getMaterial().toUpperCase() + " ===");
        System.out.println("Durabilidade atual: " + durabilidade);
        System.out.println("Força: " + forca);
        System.out.println("Blocos a minerar: " + blocos);

        if (estaQuebrada()) {
            System.out.println("Picareta quebrada!");
            return 0;
        }

        int blocosMinerados = 0;
        for (int i = 0; i < blocos; i++) {
            if (durabilidade <= 0) {
                System.out.println("Picareta quebrou no bloco " + (i + 1));
                break;
            }
            durabilidade--;
            blocosMinerados++;
        }

        System.out.println("\nMinerados " + blocosMinerados + " blocos");
        System.out.println("Durabilidade restante: " + durabilidade);

        if (estaQuebrada()) {
            System.out.println("A picareta de " + getMaterial() + " quebrou completamente!");
        }

        return blocosMinerados;
    }

    public void reparar(int quantidade) {
        System.out.println("\n=== REPARANDO PICARETA DE " + getMaterial().toUpperCase() + " ===");
        System.out.println("Durabilidade atual: " + durabilidade);
        System.out.println("Quantidade a reparar: " + quantidade);

        int novaDurabilidade = durabilidade + quantidade;
        if (novaDurabilidade > durabilidadeMaxima) {
            System.out.println("Reparo limitado a " + durabilidadeMaxima);
            novaDurabilidade = durabilidadeMaxima;
        }

        durabilidade = novaDurabilidade;
        System.out.println("Durabilidade nova: " + durabilidade);
    }

    @Override
    public String toString() {
        return "Picareta de " + getMaterial() + " (D: " + durabilidade + ", F: " + forca + ")";
    }
}
