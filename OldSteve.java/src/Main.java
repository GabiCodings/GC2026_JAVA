import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║   VELHO STEVE - FÁBRICA DE PICARETAS (VERSÃO POO)          ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");

        List<Picareta> picaretas = new ArrayList<>();
        picaretas.add(new PicaretaMadeira(50, 5));
        picaretas.add(new PicaretaPedra(70, 8));
        Picareta picaretaFerro = new PicaretaFerro(100, 12);
        picaretas.add(picaretaFerro);

        System.out.println("\nPicaretas fabricadas:");
        for (Picareta p : picaretas) {
            System.out.println("  • " + p);
        }

        System.out.println("\nUsando picareta de ferro para minerar...");
        picaretaFerro.minerar(30);
        picaretaFerro.minerar(20);

        System.out.println("\nCriando picareta de ouro...");
        Picareta picaretaOuro = new PicaretaOuro(30, 15);
        picaretas.add(picaretaOuro);

        System.out.println("\nReparando a picareta de ferro...");
        picaretaFerro.reparar(50);

        System.out.println("\nEstado final das picaretas:");
        for (Picareta p : picaretas) {
            System.out.println("  • " + p);
        }
    }
}