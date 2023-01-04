package t05_klassen;

public class Unterklasse  extends Oberklasse {

    public Unterklasse() {
        super.methodeOberklasse();

    }

    public Unterklasse(String str) {
        super(str);
        System.out.println(str);
    }

    @Override
    public void methodeOberklasse() {
        //super.methodeOberklasse();
    }
}
