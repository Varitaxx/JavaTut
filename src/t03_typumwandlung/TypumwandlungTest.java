package t03_typumwandlung;

public class TypumwandlungTest {

    public static void main(String[] args) {
        // lokale Variablen
        char posChar, negChar;
        short posShort = 1;
        short negShort = -1;
        /* explizite Typumwandlung von dem Datentyp short in den Datentyp char */
        posChar = (char) posShort;
        negChar = (char) negShort;

// Ausgabe der expliziten Typumwandlung von oben
        System.out.println("positiver Short " + posShort + " ist als Char " + posChar);
        System.out.println("negativer Short " + negShort + " ist als Char " + negChar);
        /* Ausgabe der erneuten expliziten Typumwandlung, diesmal von char nach int */
        System.out.println("positiver Short " + posShort +" ist als Char " + (int) posChar);
        System.out.println("negativer Short " + negShort + " ist als Char " + (int) negChar);
    }
}
