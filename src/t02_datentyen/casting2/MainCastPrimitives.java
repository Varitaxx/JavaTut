package t02_datentyen.casting2;

public class MainCastPrimitives {
    /*
    static  int i = 10200;
    static double d = 22.2;
    static float f = 13.9f;
    static short s = 8;
    static long l = 3377000;
    */


    public static void main(String[] args) {
        byte b = 3;
        int i = 10200;
        double d = 22000.2;
        float f = 13.9f;
        short s = 8;
        long l = 3377000000l;

        byte berg = (byte) (b + l);
        System.out.println(berg);

        // casten von short zu
        short serg = (short) (s + i);
        serg = (short) (s + l);
        System.out.println(serg);
        serg = (short) (s + f);
        serg = (short) (s + d);



        // casten von int zu...
        int ierg = i + s;
        ierg = i + (int)l;
        System.out.println(ierg);
        ierg = i + (int)f;
        ierg = i + (int)d;
        System.out.println(ierg);

        // casten von long zu...
        long lerg = l + s;
        lerg = l + i;
        lerg = l + (long)f;
        lerg = l + (long)d;
        System.out.println(lerg);

        // casten von float zu
        float flerg = f + s;
        flerg = f + i;
        flerg = f + l;
        flerg = f + (float)d;
        System.out.println(flerg);

        // casten von double zu
        double derg = d + s;
        derg = d + i;
        derg = d + l;
        derg = d + f;
        System.out.println(derg);

    }
}
