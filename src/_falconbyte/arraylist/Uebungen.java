package _falconbyte.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Uebungen {
    public static void main(String[] args) {

        List<String> sammlung = new ArrayList<>();
        sammlung.add("rot");
        sammlung.add("blau");
        sammlung.add("grün");
        sammlung.add("gelb");

        for (String s : sammlung) {
            System.out.println(s);

        }

        //sammlung.remove(2);
        if(sammlung.remove("grün")){
            sammlung.add("lila");
            sammlung.add("grau");

        }

        for (String s : sammlung) {
            System.out.println(s);

        }


    }
}
