package _falconbyte.polymorphie.typumwandlung;

public class Mops extends Hund{

    public void mopsMethode(){
        System.out.println("..macht Mops-was");
    }

    @Override
    public void bellen() {
        System.out.println("Mops kläfft");
    }
}
