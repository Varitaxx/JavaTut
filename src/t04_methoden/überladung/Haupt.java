package t04_methoden.überladung;

public class Haupt {
    public static void main(String[] args) {
        //Überladung
        //Mehrere Methoden, gleicher Name, unterschiedliche Parameter
        int zahl1 = 234;
        int zahl2 = 642;
        int zahl3 = 973;
        addieren(zahl1, zahl2);
        addieren(zahl1, zahl2, zahl3);

    }

    public static void addieren(int zahl1, int zahl2){
        System.out.println(zahl1 + zahl2);
    }

    public static void addieren(int zahl1, int zahl2, int zahl3){
        System.out.println(zahl1 + zahl2 + zahl3);
    }
}
