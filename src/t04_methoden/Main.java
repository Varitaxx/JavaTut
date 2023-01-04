package t04_methoden;

public class Main {

    public static void main(String[] args) {
        methode1("Hallo", 13);

        Klasse2 obj1 = new Klasse2();
        obj1.methode2("Hallo");

    }

    public static void methode1(String str, int zahl){
        System.out.println(str + " " + zahl);
    }
}

class Klasse2{

    public void methode2(String str){
        System.out.println(str);
    }
}
