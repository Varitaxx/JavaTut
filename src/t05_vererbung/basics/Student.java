package t05_vererbung.basics;

public class Student extends Mensch{

    @Override
    public void machEtwas() {
        System.out.println("Der Student macht was....");
    }

    public void tuNix(){
        System.out.println("Kein Bock, was zu tun");
    }
}
