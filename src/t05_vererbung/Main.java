package t05_vererbung;

public class Main {

    public static void main(String[] args) {
        Lebewesen lebewesen = new Lebewesen();
        lebewesen.fortPfanzen();
        Tier tier = new Tier();
        tier.fortPfanzen();
        tier.macheGeräusch();
        Hund hund = new Hund();
        hund.macheGeräusch();


    }
}
