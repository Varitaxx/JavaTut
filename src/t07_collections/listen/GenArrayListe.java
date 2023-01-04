package t07_collections.listen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenArrayListe {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(3);
        ints.add(30);
        ints.add(-33);
        ints.add(13);
        ints.add(25);
        ints.add(-2);

        for (Integer anInt : ints) {
            System.out.print(anInt + ", ");
        }

        Collections.sort(ints);
        System.out.println();

        for (Integer anInt : ints) {
            System.out.print(anInt + ", ");
        }
        System.out.println();
        List<Integer> ints2 = new ArrayList<>();
        ints2.addAll(ints);
        ints2.add(200);

        for (Integer integer : ints2) {
            System.out.println(integer);

        }

    }
}
