package t05_interfaces.IF01;

public class Dackel implements HundInterface {
    private int beine = 4;
    int alter;
    private String name;
    int gewicht;

    public Dackel(int alter, String name, int gewicht) {
        this.alter = alter;
        this.name = name;
        this.gewicht = gewicht;
    }

    public int getBeine() {
        return beine;
    }

    public void setBeine(int beine) {
        this.beine = beine;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    @Override
    public void bellen() {
        System.out.println("Wau wau");
    }

    @Override
    public void fressen() {
        System.out.println("Maaampf");
    }
}
