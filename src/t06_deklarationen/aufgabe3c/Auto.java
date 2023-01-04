package t06_deklarationen.aufgabe3c;

enum Farbe{ROT, BLAU, GRÜN, GELB, SCHWARZ, WEISS, ANTRAZIT}
enum Getriebe{AUTOMATIK, SCHALTUNG}
enum Antrieb{ALLRAD, FRONT, HECK}
enum Kraftstoff{BENZIN, SUPER, DIESEL, GAS, ELEKTRO, HYBRID}

public class Auto {
    private String hersteller;
    private String modell;
    private Farbe farbe;
    private Getriebe getriebe;
    private Antrieb antrieb;
    private Kraftstoff kraftstoff;
    private int anzahlZylinder;
    private int hubraum;

    //Konstruktor
    public Auto(String hersteller, String modell, Farbe farbe, Getriebe getriebe, Antrieb antrieb, Kraftstoff kraftstoff, int anzahlZylinder, int hubraum) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.farbe = farbe;
        this.getriebe = getriebe;
        this.antrieb = antrieb;
        this.kraftstoff = kraftstoff;
        this.anzahlZylinder = anzahlZylinder;
        this.hubraum = hubraum;
    }

    public void printInfo(){
        System.out.println("############# Auto Start #################");
        System.out.println("Hersteller/Modell: " + hersteller + " " + modell);
        System.out.println("Farbe: " + farbe);
        System.out.println("Getriebe: " + getriebe);
        System.out.println("Antrieb: " + antrieb);
        System.out.println("Kraftstoff: " + kraftstoff);
        System.out.println("Zylinder: " + anzahlZylinder);
        System.out.println("Hubraum: " + hubraum + "ccm");
        System.out.println("############### Auto Ende ###############");
    }
}
