package t05_interfaces.IF01;

public class Lapdrador implements HundInterface {
    int alter;
    String name;
    String farbe;

    public Lapdrador(int alter, String name, String farbe) {
        this.alter = alter;
        this.name = name;
        this.farbe = farbe;
    }

    @Override
    public void bellen() {
        System.out.println("Wuff wuff");
    }

    @Override
    public void fressen() {
        System.out.println("Mampf mampf");
    }
}
