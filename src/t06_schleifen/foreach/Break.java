package t06_schleifen.foreach;

import java.util.Random;

public class Break {
    public static void main(String[] args) {
        //break
        for (int i = 0; i < 12; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("Random-Aufgabe Abbruch bei 3 mal hintereinander eine 6");

        Random random = new Random();
        int zaehler = 0;
        int wuerfe = 0;
        while (zaehler != 3) {
            int i = random.nextInt(6) +1;

            if (i == 6) {
                zaehler++;
            }
            else {
                zaehler = 0;
            }
            wuerfe++;

            System.out.print(i + ", ");

        }
        System.out.println("\nGeschafft! Es wurde 3 * eine 6 hintereinander gewürfelt.");
        System.out.println("Es wurden dafür " + wuerfe + " Würfe benötigt");
    }

}
