package t03_typumwandlung;
/*
 * Beispielanwendung implizite und explizite Typumwandlung in Java.
 */
public class TypumwandlungPrimitiv {
    public static void main(String[] args) {

        // Explizite Typumwandlung
        int valueInt     = 128;
        short valueShort = (short) valueInt;

// Konvertierungsfehler, da Wertebereich von byte-Datentyp (-128, 127)
        byte valueByte   = (byte) valueInt;

        System.out.println("\nvalueInt:   " + valueInt);
        System.out.println("valueShort: " + valueShort);
        System.out.println("valueByte:  " + valueByte);

// Implizite Typumwandlung
        valueShort = 2013;
        float valueFloat = valueShort;

        System.out.println("\nvalueShort: " + valueShort);
        System.out.println("valueFloat: " + valueFloat);

// Konvertierungsfehler bei impl. Typumwandlung nach arithm. Ausdruck
        valueShort = 23;
        valueFloat = valueShort/2;

        System.out.println("\nvalueShort: " + valueShort);
        System.out.println("valueFloat: " + valueFloat);

// kein Konvertierungsfehler da arithm. Ausdruck korrekt angegeben
        valueShort = 23;
        valueFloat = valueShort/2.0F;

        System.out.println("\nvalueShort: " + valueShort);
        System.out.println("valueFloat: " + valueFloat);

// kein Konvertierungsfehler da arithm. Ausdruck durch explizite
// Typumwandlung korrekt angegeben
        valueShort = 23;
        valueFloat = valueShort/(float)2;

        System.out.println("\nvalueShort: " + valueShort);
        System.out.println("valueFloat: " + valueFloat);
    }

}
