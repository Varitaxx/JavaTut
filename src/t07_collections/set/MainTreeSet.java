package t07_collections.set;

import java.util.Set;
import java.util.TreeSet;

public class MainTreeSet {
    public static void main(String[] args) {
        Set<String> weapons = new TreeSet<>();
        weapons.add("Sniper");
        weapons.add("Sniper");
        weapons.add("AK-47");
        weapons.add("Gunslire");

        for (String weapon : weapons) {
            System.out.println(weapon);
        }


    }
}
