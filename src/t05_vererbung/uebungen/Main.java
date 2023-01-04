package t05_vererbung.uebungen;

public class Main {
    public static void main(String[] args) {
       Auto mb = new Auto();
       Laster lkw = new Laster();
       mb.geschwindigkeit = 120;
       //lkw.geschwindigkeit = 100;
        System.out.println(mb.abbremsen(50));
        Auto.lichtAn();
        mb.lichtAn();

    }
}
