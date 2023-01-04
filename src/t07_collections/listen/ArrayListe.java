package t07_collections.listen;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListe {
    public static void main(String[] args) {
        ArrayList liste = new ArrayList();
        liste.add("Mercedes");
        liste.add("Mazda");
        liste.add("Ferrari");
        liste.add("Aston Martin");

        System.out.println(liste);

        for (Object o : liste) {
            System.out.println(o);
        }

        //sortieren
        Collections.sort(liste);

        for (Object o : liste) {
            System.out.println(o);

        }

    }
}
