package t04_methoden.überladung;

public class Main {
    public static void main(String[] args) {
        // Ein Fahrzeug wird als Auto-Objekt aufgerufen
        Fahrzeug auto = new Auto();
        //
        auto.fahren();
        System.out.println(auto.getGeschwindigkeit()); // Wert von Fahrzeugklasse, da Variablen nicht überschrieben werden
        Fahrzeug fahrzeug = new Fahrzeug();
        System.out.println(fahrzeug);

    }
}
