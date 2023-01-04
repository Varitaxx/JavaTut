package _falconbyte.methoden1;

public class Roboter {
    private String bezeichnung;
    private String typ;
    private double energie;
    private int aktuelleGeschwindigkeit;

    public Roboter(){
        bezeichnung = "Opportunity";
        typ = "Mars Rover";
        energie = 100;
        aktuelleGeschwindigkeit = 0;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public double getEnergie() {
        return energie;
    }

    public void setEnergie(double energie) {
        this.energie = energie;
    }

    public int getAktuelleGeschwindigkeit() {
        return aktuelleGeschwindigkeit;
    }

    public void setAktuelleGeschwindigkeit(int aktuelleGeschwindigkeit) {
        this.aktuelleGeschwindigkeit = aktuelleGeschwindigkeit;
    }

    public void printInfos(){
        System.out.println("Details: " + bezeichnung + "/" + typ);
        System.out.println("Energiestatus: " + energie );
        System.out.println("Aktuelle Geschwindigkeit: " + aktuelleGeschwindigkeit);
    }

    public void beschleunige(){
        aktuelleGeschwindigkeit += 2;
        energie -= 2;
    }

    public void bremse(){
        aktuelleGeschwindigkeit -= 2;
        energie -= 1;
    }

    public void tutEtwas(){
        Roboter r1 = new Roboter();
        r1.beschleunige();
    }
}
