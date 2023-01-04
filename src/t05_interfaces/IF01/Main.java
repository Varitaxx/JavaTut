package t05_interfaces.IF01;

public class Main {
    public static void main(String[] args) {
        //Klasse -> Superklasse
        //Klasse -> Interface *
        HundInterface molly = new Lapdrador(5,"molly", "weiß");
        HundInterface bruno = new Dackel(10, "bruno", 6);
        HundInterface senta = new Schäferhund();
        HundInterface[] hunde = {molly,bruno,senta};

        for (HundInterface hund : hunde) {
            System.out.println(hund.getClass().toString());
            hund.bellen();
            hund.fressen();
        }
    }
}
