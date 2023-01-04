package t02_datentyen.casting;

public class Main {
    //Upcast: Subklasse -> Superklasse (verallgemeinern)
    //Downcast: Superklasse -> Subklasse (spezialisieren)
    //Polymorphie


    public static void main(String[] args) {
        Person person = new Person();
        Person schüler = new Schüler(); //Upcast
        Schüler schüler1 = (Schüler)schüler;//Downcast
        OberStufenSchüler person2 = (OberStufenSchüler) new Person();
    }
}
