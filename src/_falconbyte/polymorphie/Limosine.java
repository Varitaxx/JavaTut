package _falconbyte.polymorphie;

public class Limosine extends Auto{
    @Override
    public void fahren() {
        super.fahren();
        System.out.println("Limosine fährt");
    }

    public void luxusInterior(){
        System.out.println("purer Luxus");
    }
}
