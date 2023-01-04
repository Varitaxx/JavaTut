package _falconbyte.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<Elch> sammlung = new ArrayList<>();

        Elch e1 = new Elch("Rudolph", 7);
        Elch e2 = new Elch("Rudine", 7);
        Elch e3 = new Elch("Bertram", 6);


        sammlung.add(e1);
        sammlung.add(e2);
        sammlung.add(e3);

        Elch e4 = sammlung.get(1);
        e4.setName("Kessy");
        e4.setAlter(6);
        sammlung.add(e4);

        System.out.println(sammlung.size());
        for (Elch elch : sammlung) {
            System.out.println("Name: " + elch.getName()+ " Alter: " + elch.getAlter());
            System.out.println(elch);

        }

    }
}
