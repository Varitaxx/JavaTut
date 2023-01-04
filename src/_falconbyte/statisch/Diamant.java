package _falconbyte.statisch;

public class Diamant {
    public static int count;

    public Diamant(){
        count++;
    }
}

class DiamantTest{
    public static void main(String[] args) {

        new Diamant();
        new Diamant();
        new Diamant();
        new Diamant();
        new Diamant();

        //Wieviele Diamant-Objekte wurden erzeugt?
        System.out.println(Diamant.count);
    }
}
