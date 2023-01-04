package _falconbyte.passbyvalue;

public class Samus {

    public static void modidy(int x, int y){
        x = 3;
        y = 4;
    }

    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        System.out.println(" x = " + x + " ; y = " + y); // x = 1 ; y = 2
        Samus.modidy(x,y); // hier wird nur intern die übergebenen Werte verändert.
        System.out.println(" x = " + x + " ; y = " + y); // x = 1 ; y = 2
    }
}
