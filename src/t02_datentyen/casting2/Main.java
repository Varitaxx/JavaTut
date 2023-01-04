package t02_datentyen.casting2;

public class Main {
    public static void main(String[] args) {


        double varDouble = 5.33;
        int varInt = 1220;
        byte varByte = 3;
        int zahl1 = varByte;
        //wenn ich in einem kleineren DT einen größeren packen will, muss ich casten:
        short zahl2 = (short) varInt;
        System.out.println(zahl2);

        int summe = (int) varDouble + varInt;
        double summe2 = varDouble + varInt;
        byte summe3 = (byte) (varInt + varByte);
        System.out.println(summe);
        System.out.println(summe2);
        System.out.println(summe3);

        char varChar = 'v';
        String str = "Hallo";
        str = str.concat(String.valueOf(varChar));
        System.out.println(str);
        String str2 = String.valueOf(varChar);
        System.out.println(str2);
        char varChar2 = str.charAt(0);
        System.out.println(varChar2);
    }
}
