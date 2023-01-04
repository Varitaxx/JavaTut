package _falconbyte.klassenbibliotheken;

import java.util.ArrayList;
import java.util.Random;

public class ThisIsRandom {
    public void schwereAufgabe(){

        ArrayList<String> liste = new ArrayList<>();
        liste.add("eins");
        liste.add("zwei");
        liste.add("drei");
        liste.add("vier");
        liste.add("fünf");

        // Ausgabe eines Listenmitglieds per Zufallsgenerator
        Random r = new Random();
        System.out.println(liste.get(r.nextInt(5)));
    }

    public static void main(String[] args) {
        ThisIsRandom tr = new ThisIsRandom();
        tr.schwereAufgabe();
    }
}
