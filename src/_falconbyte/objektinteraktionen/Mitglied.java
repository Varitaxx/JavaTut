package _falconbyte.objektinteraktionen;

public class Mitglied {

    private String name;
    private int beitritt;

    public Mitglied(String name, int beitritt) {
        this.name = name;
        this.beitritt = beitritt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBeitritt() {
        return beitritt;
    }

    public void setBeitritt(int beitritt) {
        this.beitritt = beitritt;
    }
}
