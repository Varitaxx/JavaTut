package t01_operatoren.bitweise;

public class Main {
    public static void main(String[] args) {
        //Byte: 181
        //128 + 32 + 16 + 4 + 1
        //0000 1011 0101

        byte number1 = 10;
        byte number2 = 25;

        System.out.println(number1 & number2);
        //00001010 (10)
        //00011001 (25)
        //--------------(nur wo bei allen werten eine 1)
        //00001000 (8)

        int zahl1 = 10;
        int zahl2 = 25;
        System.out.println(zahl1 | zahl2);
        //00001010 (10)
        //00011001 (25)
        //--------------(mindestens bei einem wert eine 1)
        //00011011 (27)

        System.out.println(number1 ^ number2);
        //00001010 (10)
        //00011001 (25)
        //--------------(nur bei einem wert eine 1)
        //00010011 (19)

        //Komplement (~)
        System.out.println(number1);
        System.out.println(~number1); //negativer Wert um eins verringert (-1)
        //10001010 (10)
        //01110101 (-11) -> -10 -1 = -11

        //Left-shift (<<) x Positionen nach links
        System.out.println(11 << 2); // 2 Positionen nach links
        //00001011
        //-----------
        //00101100 = 32 + 8 + 4 = 44

        //Right-shift (>>)
        System.out.println(49 >> 3);// 3 Positionen nach rechts
        //00110001
        //----------
        //00000110 = 4 + 2 = 6


    }

}
