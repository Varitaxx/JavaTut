package t05_klassen;

public class TestKlasse {
    public static void main(String[] args) {
        Abc a = new Abc();


    }
}

class Abc{

    public static final double PI = 3.14;
    public static int zahl;
    public int andereZahl;

    public static double flaecheKreis(int r){
        return PI * Math.pow(r,2);
    }
}