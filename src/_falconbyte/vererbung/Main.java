package _falconbyte.vererbung;

public class Main {
    public static void main(String[] args) {
        new Hund().geraeuschMachen();
        new Katze().geraeuschMachen();
        new Eisbaer().geraeuschMachen();
        Saeugetier hund = new Hund();
        hund.geraeuschMachen();
        System.out.println(new Hund().getAlter());
    }
}
