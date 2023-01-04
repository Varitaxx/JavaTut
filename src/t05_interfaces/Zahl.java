package t05_interfaces;

public class Zahl implements  X{

    private int a;

    //alle Funktionen aus dem Interface X übernehmen

    @Override
    public void addition() {
        System.out.println("Du führst eine Addition aus");
    }
}
