package t07_arrays.eindim;

import java.util.Arrays;

public class ArraySortieren {
    public static void main(String[] args) {

        String[]strings = {"N", "L", "n","O","S"};
        // Mit Arrays.sort lassen sich Arrays sortieren
        // Die Klasse Arrays muß importiert werden
        Arrays.sort(strings);
        for (String string : strings) {
            System.out.println(string);
        }

    }
}
