package t05_vererbung.uebungen;

public class Auto {

    String hersteller;
    String modell;
    String farbe;
    String antrieb;
    int leistung;
   public int geschwindigkeit;

    public Auto(){

    }

    public Auto(String hersteller, String modell, String farbe, String antrieb, int leistung, int geschwindigkeit) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.farbe = farbe;
        this.antrieb = antrieb;
        this.leistung = leistung;
        this.geschwindigkeit = geschwindigkeit;
    }

     int beschleunigen(int gasGeben){
       return geschwindigkeit += gasGeben;
    }

    int abbremsen (int gasWeg){
        return geschwindigkeit -= gasWeg;
    }

    private void hupen(){
        System.out.println("Hup...hup");
    }
    protected static void lichtAn(){
        System.out.println("Beleuchtung an");
    }
}
