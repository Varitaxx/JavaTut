package t05_klassen.random;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        //int zufallsZahl = random.nextInt(6) + 1;//1 - 6
        //System.out.println(zufallsZahl);
        String letters = "BCDFGHJKLMNPQRSTVWXYZ";
        String vocals = "AEIOU";
        String word = "";
        int stelle;

        for(int i = 1; i < 6; i++){
            if(i % 2 == 0){
                stelle = random.nextInt(5);
                word += vocals.charAt(stelle);
            }
            else {
                stelle = random.nextInt(21);
                word += letters.charAt(stelle);
            }
        }
        System.out.println(word);
    }
}
