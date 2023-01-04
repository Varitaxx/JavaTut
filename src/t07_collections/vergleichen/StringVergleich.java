package t07_collections.vergleichen;

import java.util.Arrays;

public class StringVergleich {

    public static void main(String[] args) {
         String s1 = "Dappy";
         String s2 = "Coders";

         Integer zahl1 = 11;
         Integer zahl2 = 13;

         int result = s1.compareTo(s2);

        System.out.println(result);

        result = zahl1.compareTo(zahl2);

        System.out.println(result);

        String[] names = {"Mary", "James", "Patricia", "John", "Jennifer", "Robert"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }
}
