package _falconbyte.klassen;

public class Katze {
    private String name;
    private String rasse;
    private int alter;

    public Katze(String name, String rasse) {
        this.name = name;
        this.rasse = rasse;
        alter = 0;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    void miauMachen(){
        System.out.println("miau!");
    }

    public int alterErhoehen(){
        return alter += 1;
    }

    void detailsAusgeben(){
        System.out.println("Die Katze heisst: " + name + " ihre Rasse lautet: " +
                rasse + " und sie ist " + alter + " Jahre alt.");
    }
}
