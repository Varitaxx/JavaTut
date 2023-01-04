package t06_deklarationen.modifier.access;

public class HauptKlasse {

    public static String wort1 = "Hallo Weltall";
    protected static String wort2 = "Hallo Erde";
    static String wort3 = "Hallo Kontinent";
    private static String wort4 = "Hallo Land";

    public static void main(String[] args) {
        System.out.println(wort1);
        System.out.println(wort2);
        System.out.println(wort3);
        System.out.println(wort4);
        InnerHauptKlasse.ausgabe();
    }

    public static class InnerHauptKlasse {
        public static void ausgabe(){
            System.out.println("Inner: " + wort1);
            System.out.println("Inner: " + wort2);
            System.out.println("Inner: " + wort3);
            System.out.println("Inner: " + wort4);
        }

    }
}
