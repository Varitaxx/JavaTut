package _falconbyte.arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] meinArray = {5, 2, 1, 4, 3};

        // Array in String zurückliefern
        Arrays.toString(meinArray);
        System.out.println(Arrays.toString(meinArray)); // [5, 2, 1, 4, 3]

        // Array sortieren
        double[] meinArray1 = {2.3, 1.1, 2.2};
        Arrays.sort(meinArray1);
        System.out.println(Arrays.toString(meinArray1)); // [1.1, 2.2, 2.3]

        // Strings sortieren
        String[] liste = {"Brutus", "Augustus", "Caesar"};
        Arrays.sort(liste);
        System.out.println(Arrays.toString(liste)); // [Augustus, Brutus, Caesar]

        //Sortierung von Objekttypen

        // Binäre Suche
        Arrays.binarySearch(meinArray, 1); // 0

        // Array füllen
        Arrays.fill(meinArray, 1); // 1, 1, 1, 1, 1

        // Array kopieren
        int[] kopie = Arrays.copyOf(meinArray, meinArray.length);

        // Arrays vergleichen
        Arrays.equals(meinArray, kopie); // true

    }


}
