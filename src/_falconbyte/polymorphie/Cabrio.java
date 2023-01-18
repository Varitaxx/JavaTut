package _falconbyte.polymorphie;

public class Cabrio extends Auto{

    public void verdeckOeffnen(){
        System.out.println("Verdeck offen");
    }

    @Override
    public void fahren() {
        super.fahren();
        System.out.println("Cabrio fährt");
    }
}
