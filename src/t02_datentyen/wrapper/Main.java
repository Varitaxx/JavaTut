package t02_datentyen.wrapper;

public class Main {
    public static void main(String[] args) {
        //Wrapper-Klassen <=> primitive Datentypen
        int i = 5;
        Integer i2 = new Integer(i);// Boxing (veraltet)
        Integer i3 = i;             // Autoboxing

        int j = i2.intValue();      // Unboxing



        // Boolean

        System.out.println(Boolean.logicalXor(true, true));




    }
}
