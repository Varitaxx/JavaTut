package _falconbyte.klassen.singleton;

public class Main {
    public static void main(String[] args) {
        Zentralbank zentralbank = Zentralbank.getInstance();
        System.out.println("Der aktuelle Leitzins liegt bei: " + zentralbank.getLeitzins() + " Prozent");

        zentralbank.setLeitzins(0.4);
        System.out.println("Der aktuelle Leitzins liegt bei: " + zentralbank.getLeitzins());

    }

}

