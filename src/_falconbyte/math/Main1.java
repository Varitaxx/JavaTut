package _falconbyte.math;

public class Main1 {
    public static void main(String[] args) {
        double d = 3.5;
        double d2 = -3.5;
        System.out.println(Math.floor(d));
        System.out.println(Math.ceil(d2));
        System.out.println(Math.ceil(d));

        //Übungen
        System.out.println("Einfache Aufgabe");
        double b = Math.sqrt(64);

        System.out.println("Quadratwurzel aus 64 potenziert mit 3: " + Math.pow(b,3));
        System.out.println("Mittlere Aufgabe");
        double z1 = 3.25;
        double z2 = 1.25;
        double z3 = 2;

        double durchschnitt = (z1 + z2 + z3) / 3;
        System.out.println(durchschnitt);
        System.out.println("Der gerundete Durchschnitt der drei Zahlen: " + Math.round(durchschnitt));
        System.out.println("Schwere Aufgabe");
        Main1 m1 = new Main1();
        m1.wuerfelspiel(5,9);


    }
    public void wuerfelspiel(int zahl, int n){
        int punkte = 0;
        for (int i = 1; i < n; i++) {
            int zufall = (int)(Math.random() * 6) + 1;
            System.out.print(zufall + " ");
            if(zufall == zahl){
                punkte++;
            }
        }
        System.out.println("Punktzahl: " + punkte);
    }
}
