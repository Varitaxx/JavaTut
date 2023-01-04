package t05_vererbung;

public class Hund extends Tier {

    int alter;
    String art;
    String fellfarbe;
    boolean kannPfoteGeben;

    //Konstruktoren
    public Hund() {
    }

    public Hund(int alter, String art, String fellfarbe, boolean kannPfoteGeben) {
        this.alter = alter;
        this.art = art;
        this.fellfarbe = fellfarbe;
        this.kannPfoteGeben = kannPfoteGeben;
    }
}
