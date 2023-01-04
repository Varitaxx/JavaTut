package _falconbyte.schleifen;

import java.util.Random;

public class continueBreakLabels {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if(i == 3)
                //continue;
                break;

            System.out.print(i + " ");
        }
        System.out.println();

        // Beispiel mit Labels

        Random random = new Random();

        forLoop: for (int i = 0; i < 3; i++) {

            whileLoop: while (true){
                int i2 = random.nextInt(5);
                if(i2 == 1){
                    System.out.println("Erfolgreich");
                    continue forLoop;
                }

            }//end while


        }//End for

    }
}
