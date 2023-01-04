package _falconbyte.klassen;

public class Main {
    public static void main(String[] args) {
        /*
        //Aufgabe: mittel
        Katze cat1 = new Katze("Zammis", "europ. Kurzhaar");

        cat1.alterErhoehen();
        cat1.miauMachen();
        cat1.detailsAusgeben();

         */

        // Aufgabe: schwer
        Katze cat1 = new Katze("Zammis", "europ. Kurzhaar");
        Katze cat2 = new Katze("Soul", "europ. Kurzhaar");
        Katze cat3 = new Katze("O'Brian", "europ. Kurzhaar");
        Katze cat4 = new Katze("C.C.", "europ. Kurzhaar");
        Katze [] katzen = {cat1, cat2, cat3, cat4};
        for (Katze katze : katzen) {
            katze.setAlter(7);
            katze.detailsAusgeben();

        }
    }
}
