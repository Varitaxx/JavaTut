package t08_modifier.statics;
import _test.grundklassen.Taschenrechner;

public class Main {
    //static = Objekt-Unabhängigkeit
   static int value = 10;
    public static void main(String[] args) {
        Katze katze = new Katze();
        Katze katze2 = new Katze();
        katze.getFarbe();
        katze2.getFarbe();
        katze.setFarbe("Schwarz");
        katze.getFarbe();
        katze2.getFarbe();
        //***************************************

        int zahl1 = 3;
        int zahl2 = 8;
        int zahl3 = 13;
        int erg = Taschenrechner.max(zahl1,zahl2);

        System.out.println(Taschenrechner.addieren(zahl1,zahl2));
        System.out.println(erg);

        Taschenrechner texas = new Taschenrechner();
        System.out.println(texas.addieren(5,9));




    }
}
