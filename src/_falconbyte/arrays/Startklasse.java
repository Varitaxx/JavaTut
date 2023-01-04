package _falconbyte.arrays;

import java.util.Arrays;

public class Startklasse {
    public static void main(String[] args) {

        A[]a = { new A(), new A(), new A(), new A()};
        A[]b = Arrays.copyOfRange(a, 1,3);

        a[2].setV(1);

        System.out.println(b[1].getV());
        System.out.println(b.length);
    }
}
