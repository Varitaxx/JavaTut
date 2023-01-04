package t07_collections.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainHashMap1 {
    public static void main(String[] args) {
       /* Map map = new HashMap();
        //(Key, value)
        map.put("Apfel", 0.05);
        map.put(true, 12345);
        map.put("Birne", 0.07);
        System.out.println(map.get("Apfel"));*/

        /*Map<Integer, String> plz = new HashMap<>();
        plz.put(54500, "Hetzerath");
        plz.put(45770, "Marl");
        plz.put(50667, "Köln");
        plz.put(48143, "Münster");
        plz.put(55000, "Trier");
        plz.put(43447, "Essen");
        System.out.println(plz.get(55000));*/

        Map<String, Integer> mountains = new HashMap<>();
        mountains.put("Lhotse", 8516);
        mountains.put("Kantsch", 8586);
        mountains.put("K2", 8610);
        mountains.put("Mount Everest", 8848);

        Set<String> keyset = mountains.keySet();
        for (String s : keyset) {
            System.out.println("Der Berg " + s + " ist " + mountains.get(s) + " Meter hoch.");
        }

    }
}
