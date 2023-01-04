package t07_collections.listen;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] primeNumbers = new int[3];
        primeNumbers[0] = 2;
        primeNumbers[1] = 3;
        primeNumbers[2] = 5;

        List<Integer> primeNumberList = new ArrayList<>();
        primeNumberList.add(2);
        primeNumberList.add(3);
        primeNumberList.add(5);

        System.out.println(primeNumberList.get(1));

        for (int i = 0; i < primeNumberList.size(); i++) {
            System.out.println(primeNumberList.get(i));
        }

        for (Integer i : primeNumberList) {
            System.out.println(i);
        }
    }
}
