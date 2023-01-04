package t04_methoden.rückgabe;

public class TaschenrechnerTest {
    public static void main(String[] args) {


        Taschenrechner taschenrechner = new Taschenrechner();

        // 25 + (3*14) - 256

        int produkt = taschenrechner.mal(3,14);
        int subraktion = taschenrechner.subtrahieren(produkt, 256);
        int summe = taschenrechner.addieren(25,subraktion);

        System.out.println(summe);

        // Von Innen nach Außen auflösen
        System.out.println(taschenrechner.addieren(taschenrechner.subtrahieren(taschenrechner.mal(3,14), 256), 25));
    }
}
