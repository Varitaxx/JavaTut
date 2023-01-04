package t06_schleifen.foreach;

import java.util.Random;

public class Labels {
    public static void main(String[] args) {
        //labels

        // tada: vor while -> labels. Damit kann man die Abbruchbedingung z.B. von der for-Schleife
        // auf die äußere while-Schleife binden. while(true) würde endlos weiterlaufen, nur die
        // for- schleife jedesmal nur (0...5) durchlaufen also bei 6 würde abgebrochen werden.
        tada: while (true){
            for (int i = 0; i < 10; i++) {
                if(i == 6){
                    break tada;
                }
                System.out.println(i);

            }
        }

        System.out.println("*******************************");

        Random random = new Random();

        forLoop: for (int i = 0; i < 10; i++) {
           whileLoop: while (true){
                int i2 = random.nextInt(100);
                if(i2 == 1){
                    System.out.println("Erfolgreich");
                    continue forLoop;
                }

            }//end while

        }//End for
    }
}
