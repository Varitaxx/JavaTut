package t04_methoden.überladung;

public class Main2 {
    public static void main(String[] args) {
        Fahrzeug fahrzeug = new Fahrzeug();
        Fahrzeug auto = new Auto();
        Fahrzeug traktor = new Traktor();

        Fahrzeug []fahrzeuge = {fahrzeug, auto, traktor};

        for (int i = 0; i < fahrzeuge.length; i++) {
            fahrzeuge[i].fahren();
        }
    }
}
