package t02_datentyen.casting;

public class Main2 {

    //Polymorphie
    public static void main(String[] args) {

        Person lehrer = new Lehrer();
        Person schüler = new Schüler();
        Person schüler2 = new Schüler();

        Person[] personen = {lehrer, schüler, schüler2};

        for (int i = 0; i < personen.length; i++) {
            personen[i].gehen();
        }

    }
}
