package _test.grundklassen;

public class Taschenrechner {
    // +, -, *, /, %

    public static int addieren(int zahl1, int zahl2){
        return zahl1 + zahl2;
    }

    public static int subtrahieren(int zahl1, int zahl2){
        return zahl1 - zahl2;
    }

    public static int mal(int zahl1, int zahl2){
        return zahl1 * zahl2;
    }

    public static double geteilt(int zahl1, int zahl2){
        return zahl1 / zahl2;
    }

    public static int[] zusammenfassen(int zahl1, int zahl2, int zahl3){
        int[] intArray = {zahl1, zahl2, zahl3};

        return intArray;
    }

    public static int max (int a, int b){
        //Konditioneller (ternärer) Operator
        return a > b ? a : b;
    }

    public static int abs(int i){
        return i > 0 ? i : -i;
    }
}
