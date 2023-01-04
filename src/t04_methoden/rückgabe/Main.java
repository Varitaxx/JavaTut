package t04_methoden.rückgabe;

public class Main {
    public static void main(String[] args) {
        System.out.println(plusRechnen(8,6));

        int summe = plusRechnen(9,6);
        System.out.println(summe);

        System.out.println(bitteHinzuhügen("Kann ich das haben"));

        Hund hund1 = hundErstellen(2);
        Hund hund2 = hundErstellen(4);
        Hund hund3 = hundErstellen(5);


    }

    public static int plusRechnen(int zahl1, int zahl2){
        return zahl1 + zahl2;
    }

    public static String bitteHinzuhügen(String s){
        return s + ", bitte";
    }

    public static Hund hundErstellen(int alter){
        return new Hund(alter,"Labrador", "weiß", true);
    }
}

class Hund{
    int alter;
    String art;
    String fellfarbe;
    boolean kannPfotegegben;

    public Hund(int alter, String art, String fellfarbe, boolean kannPfotegegben) {
        this.alter = alter;
        this.art = art;
        this.fellfarbe = fellfarbe;
        this.kannPfotegegben = kannPfotegegben;
    }
}
