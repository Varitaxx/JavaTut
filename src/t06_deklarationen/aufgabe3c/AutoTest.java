package t06_deklarationen.aufgabe3c;

public class AutoTest {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Mercedes","C220", Farbe.ROT,Getriebe.AUTOMATIK,Antrieb.ALLRAD,Kraftstoff.ELEKTRO,6, 2200);
        auto1.printInfo();
    }
}
