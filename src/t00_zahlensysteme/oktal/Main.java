package t00_zahlensysteme.oktal;

public class Main {
    public static void main(String[] args) {

        // Oktalzahl beginnt mit ner führenden 0 Basis ist 8. Bereich immer von 0...7
        int oZ1 = 07; // 7 * 8 hoch 0 = 7
        int oZ2 = 017; // 7 * 8 hoch 0  (7)+ 1 * 8 hoch 1 (8) = 15
        int oZ3 = 0110; // 0 * 8 hoch 0 (0) + 1 * 8 hoch 1 (8) + 1 * 8 hoch 2 (64) = 72

        System.out.println(oZ1);
        System.out.println(oZ2);
        System.out.println(oZ3);
        System.out.println(oZ2 * oZ3);

    }
}
