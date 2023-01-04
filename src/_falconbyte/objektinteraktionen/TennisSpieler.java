package _falconbyte.objektinteraktionen;

public class TennisSpieler {
    private String name;
    private int itn; // International Tennis Number -> Spielerstärke 10 - 1 (beste)
    private int spiele;
    private int siege;
    private int niederlagen;

    public TennisSpieler(String name, int itn) {
        this.name = name;
        this.itn = itn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getItn() {
        return itn;
    }

    public void setItn(int itn) {
        this.itn = itn;
    }

    public int getSpiele() {
        return spiele;
    }

    public void setSpiele(int spiele) {
        this.spiele = spiele;
    }

    public int getSiege() {
        return siege;
    }

    public void setSiege(int siege) {
        this.siege = siege;
    }

    public int getNiederlagen() {
        return niederlagen;
    }

    public void setNiederlagen(int niederlagen) {
        this.niederlagen = niederlagen;
    }

    public double getSiegquote(){
        double quote = 0.0;

        quote = (double)siege / (double)spiele * 100;

        return quote;
    }

    public void erhoeheSpieleUm1(){
        spiele++;
    }

    public void erhoeheSiegeUm1(){
        siege++;
    }

    public void erhoeheNiederlagenUm1(){
        niederlagen++;
    }

    public String toString(){
        return "Name: " + getName() +
                ", Itn-Wert: " + getItn() +
                ", Spiele: " + getSpiele() +
                ", Siege: " + getSiege() +
                ", Niederlagen: " + getNiederlagen() +
                ", Siegquote: " + getSiegquote() + "%";
    }
}
