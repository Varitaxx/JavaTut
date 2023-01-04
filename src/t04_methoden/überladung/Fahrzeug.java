package t04_methoden.überladung;

public class Fahrzeug {
    int geschwindigkeit = 80;

    public int getGeschwindigkeit() {
        return this.geschwindigkeit;
    }

    public void setGeschwindigkeit(int geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public void fahren(){
        System.out.println("Motor gestartet...");
    }

    @Override
    public String toString(){
        return "Das ist ein Fahrzeug mit folgender Geschwindigkeit: " + geschwindigkeit;

    }


}
