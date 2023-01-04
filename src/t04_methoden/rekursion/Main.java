package t04_methoden.rekursion;

public class Main {
    public static void main(String[] args) {
        //Rekursion
        helloWorld(10);

    }

    public static void helloWorld(int counter){
        if(counter == 0){
            System.out.println("Fertig");
        }else {
            System.out.println("Hello World");
            helloWorld(counter - 1);
        }
    }
}
