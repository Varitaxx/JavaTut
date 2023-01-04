package t05_interfaces.IF01;

public class Schäferhund implements HundInterface{

    @Override
    public void bellen() {
        System.out.println("Whuu Whuuu");
    }

    @Override
    public void fressen() {
        System.out.println("Mumpf mumpf");
    }
}
