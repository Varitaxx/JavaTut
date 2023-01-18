package _falconbyte.klassen.singleton;

public class Zentralbank {
    private double leitzins = 0.5;

    private Zentralbank() {
    }
    private static Zentralbank zentralbank = new Zentralbank();

    public static Zentralbank getInstance(){
        return zentralbank;
    }

    public double getLeitzins() {
        return leitzins;
    }

    public void setLeitzins(double leitzins) {
        if(leitzins > 0.5) {
            this.leitzins = leitzins;
        }
    }
}
