package t07_collections;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {
        // Alle Collections:
        // Veränderbar (löschen, einfügen, verändern, ersetzen)
        // Generisch (darf aber nicht primitiver Datentyp sein)

        // Listen:
        // Arbeiten mit einem Index
        // Sind geordnet (Einfügereihenfolge)
        // Wahlfreier Zugriff über Index

        // Map ==> Assoziatives Array bei PHP
            // Key  // Value
        Map<String, Integer> einwohner = new HashMap<>();
        einwohner.put("Trier", 110_000);
        einwohner.put("Essen", 579_000);
        einwohner.put("Hamburg", 1_900_000);
        System.out.println(einwohner.get("Trier"));

        einwohner.putIfAbsent("Dorsten", 80_000); // Wird hinzugefügt, wenn noch nicht vorhanden
        einwohner.putIfAbsent("Marl", 80_000); // Wird hinzugefügt, wenn noch nicht vorhanden
        System.out.println(einwohner);
        einwohner.put("Dorsten", 75_000); // Wenn Key vorhanden, wird Wert geändert
        System.out.println(einwohner);

        Map<String, String> nahrung = new HashMap<>();
        nahrung.put("Fleisch", "Schnitzel");
        nahrung.put("Brot", "Vollkorn");
        nahrung.put("Suppe", "Gulasch");
        nahrung.put("Nudeln", "Penne");
        System.out.println(nahrung);

        nahrung.remove("Brot");
        System.out.println(nahrung);
        System.out.println("################################################");
        System.out.println(machWas());
        System.out.println("################################################");
        kücheAufräumen("Rudolph");

    }

    // Methode mit Map
    public static Map<String, String> machWas() {
        Map<String, String> namen = new HashMap<>();
        namen.put("Spiderman", "Peter Parker");
        namen.put("Black Widow", "Natasha Romanov");
        namen.put("Hulk", "Bruce Banner");
        return namen;
    }

    public static void kücheAufräumen(String name) {
        System.out.println(name + ": Küche aufräumen");
        System.out.println(name + ": Boden saugen");
        System.out.println(name + ": Boden wischen");
        System.out.println(name + ": Müll rausbringen");
        System.out.println(name + ": Geschirr abwaschen");
        System.out.println(name + ": Flächen reinigen");
        System.out.println(name + ": Schränke ausseifen");
    }
}
