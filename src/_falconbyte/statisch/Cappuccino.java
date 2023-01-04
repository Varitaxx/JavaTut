package _falconbyte.statisch;

public class Cappuccino {
    private static double preis = 3.50;

    public static void main(String[] args) {
        System.out.println(preis);
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
}
