package t07_collections.set;

import java.util.HashSet;
import java.util.Set;

public class MainHashSet {
    public static void main(String[] args) {
        //Set: keine doppelten Werte

        Set<Double> set = new HashSet<>();
        set.add(4.5);
        set.add(3.2);
        set.add(1.0);
        System.out.println(set.add(1.0));// add gibt ein boolean zurück, dadurch sieht man jetzt auch,
        System.out.println(set.add(3.2));//das die Werte nicht hier nicht eingetragen wurden
        System.out.println(set.add(23.6)); // hier: true => Wert wurde übergeben
        System.out.println("###########################");

        for (Double d : set) {
            System.out.print(d + ", ");
        }
        System.out.println();

        Set immutableSet = Set.of(3.2,11.6,7.3);

        for (Object o : immutableSet) {
            System.out.print(o + ", ");
        }
        System.out.println();

        set.addAll(Set.of(4.0, 1.0, 3.7));

        for (Double d : set) {
            System.out.print(d + ", ");
        }
        System.out.println();

        System.out.println(set.isEmpty());
        System.out.println(set.size());
        System.out.println(set.contains(4.0));






    }
}
