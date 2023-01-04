package t06_schleifen;

public class ForSchleife {

    public static void main(String[] args) {

        for(int i = 0; i <= 10; i++){
            System.out.print(i + ", ");// Anzeige der Iterationsschritte
        }// Ende der For-Schleife
        // Hier ausgeben wäre Fehler, da i nicht mehr bekannt
        // System.out.print(i + ", ");

        System.out.println();
// Verschachtelte For-Schleife
        for (int i = 0; i < 24; i++) {

            for (int j = 0; j < 60; j++) {
                System.out.println("ZEIT: " + i + ":" + j);
            } //Ende innere Schleife
        } //Ende äußere Schleife
    } // Ende main-Methode
}
