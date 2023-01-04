package t04_methoden.überladung;

public class Auto extends Fahrzeug {

    int geschwindigkeit = 120;


    public int getGeschwindigkeit() {
        return this.geschwindigkeit;
    }


    public void setGeschwindigkeit(int geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    @Override
    public void fahren() {
        System.out.println("Brum brum");
    }


}
