package t05_vererbung;

public class Tier extends Lebewesen {
    String geräusch;
    boolean kannFliegen;


    public void macheGeräusch(){
        System.out.println(geräusch);
    }
}
