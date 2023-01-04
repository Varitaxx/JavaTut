package _falconbyte.arrays;

import java.util.Arrays;

public class Uebungen {

    public static void main(String[] args) {
        //Mittel
        String[] namen = {"Peter",
                "Klaus",
                "Anton",
                "Gabriel",
                "Montana",
                "Isabella",
                "Monika",
                "Fredric",
                "Marc"};
        Arrays.sort(namen);
        System.out.println(Arrays.binarySearch(namen,"Marc"));

        // Klassenobjekte mit Comparable und compareTo:

        Roboter[] liste = {
                new Roboter("R2D2",40),
                new Roboter("C3PO",30),
                new Roboter("Nummer 5",10),
                new Roboter("Dotty Matrix",20)

        };

        Arrays.sort(liste);
        System.out.println(Arrays.toString(liste));



    }
}
