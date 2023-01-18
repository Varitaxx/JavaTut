package _falconbyte.polymorphie.uebungen2;

import java.util.ArrayList;

public class PlanetTest {
    public static void main(String[] args) {
        Planet p = null; // new Mars-Object später

        ArrayList<Planet> liste = new ArrayList<>();
        liste.add(new Mercury());
        liste.add(new Venus());
        liste.add(new Earth());
        liste.add(new Mars());
        liste.add(new Jupiter());

        for (Planet sV : liste) {
            if(sV instanceof Mars){
                p = sV; // Planet p zeigt jetzt auf das Mars-Objekt
                liste.remove(sV); //Mars-Objekt wird aus der liste gelöscht
            }

        }

        if(p instanceof Mars){
            System.out.println("The red one");
        }

        for (Planet sV : liste) {//liste hat kein Mars-Objekt mehr
            if(sV instanceof Mars){
                System.out.println("The red one");
            }

        }
    }
}
