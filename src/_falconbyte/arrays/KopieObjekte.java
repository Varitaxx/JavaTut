package _falconbyte.arrays;

import java.util.Arrays;

public class KopieObjekte {
    public static void main(String[] args) {

        Tiger one = new Tiger("Leo");
        Tiger two = new Tiger("Fauch");
        Tiger three = new Tiger("Krall");
        Tiger four = new Tiger("Joah");

        Tiger[] original = {one, two, three};

        Tiger[] kopie = Arrays.copyOf(original, original.length);


        for (Tiger tiger : original) {
            System.out.print(tiger.name + ", ");
        }
        System.out.println();
        for (Tiger tiger : kopie) {
            System.out.print(tiger.name + ", ");
        }



    }
}

class Tiger{
    String name;
    int alter;

    public Tiger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
