package _falconbyte.statisch;

public class Kaffee {
    private static String marke;

    public Kaffee(){
        marke = "Zibu";
    }

    public static void main(String[] args) {
        System.out.println(Kaffee.marke);
        Kaffee kaffee = new Kaffee();
        System.out.println(kaffee.marke);

        Kaffee.marke = "Zibu2";
        System.out.println(Kaffee.marke);
    }
}
