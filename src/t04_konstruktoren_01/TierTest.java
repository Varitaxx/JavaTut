package t04_konstruktoren_01;

public class TierTest {

    public static void main(String[] args) {
        Tier vogel = new Tier("Voegel");
        System.out.println(vogel.getArt() + " " + vogel.getName() + " " + vogel.getAlter());
        vogel.setAlter(5);
        vogel.setName("Spatz");
        System.out.println(vogel.getArt() + " " + vogel.getName() + " " + vogel.getAlter());

        Tier mensch = new Tier("Saeugetier","Mensch", 30);
        mensch.setAlter(33);
        System.out.println(mensch.getAlter());

    }
}
