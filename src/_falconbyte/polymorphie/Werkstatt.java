package _falconbyte.polymorphie;

import java.util.ArrayList;

public class Werkstatt {
    public static void reparieren(Auto a){

        System.out.println(a + "..wurde repariert!");
    }


    public static void main(String[] args) {
        Auto a1 = new Auto();
        Limosine a2 = new Limosine();
        Cabrio a3 = new Cabrio();

        /*
        //gehen alle, da alle Objekte vom Typ auto oder davon abgeleitet sind
        reparieren(a1);
        reparieren(a2);
        reparieren(a3);

         */

        ArrayList<Auto> liste = new ArrayList<>();
        liste.add(a1);
        liste.add(a2);
        liste.add(a3);

        for (Auto auto : liste) {
            auto.fahren();
            System.out.println();
        }

        Auto b1 = new Auto();
        Auto b2 = new Limosine();
        Auto b3 = new Cabrio();



    }
}
