package _test.unicode;

public class Main {
    public static void main(String[] args) {
         //Unicode-Zeichen ausgeben: 2 ^16 Zeichen ~65.000
        // 1. Win-Suche: Zeichentabelle eingeben
        // 2. Zeichen aussuchen: 4stellig
        // 3. Eingabe: Backslash-u + 4stelliger Code


        System.out.println("\u0444");
        System.out.println("Der Bruch \u00BC ist kleiner als der Bruch \u00BE");
    }
}
