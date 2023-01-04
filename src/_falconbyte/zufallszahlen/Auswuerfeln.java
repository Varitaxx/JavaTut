package _falconbyte.zufallszahlen;

import java.util.Random;

public class Auswuerfeln {
    public static void main(String[] args) {
        Random rand1 = new Random();
        Random rand2 = new Random();
        Random rand3 = new Random();
        Random rand4 = new Random();
        Random rand5 = new Random();
        System.out.println(rand1.nextInt(2,7));
        System.out.println(rand2.nextInt(6)+1);
        System.out.println(rand3.nextFloat(2,4));
        System.out.println(rand3.nextDouble());
        System.out.println(rand3.nextBoolean());



    }
}
