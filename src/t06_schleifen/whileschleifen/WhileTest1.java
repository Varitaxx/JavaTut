package t06_schleifen.whileschleifen;

public class WhileTest1 {

    public static void main(String[] args) {
        int counter = 10;


        while(true){
            System.out.println("Der Counter steht bei " + counter);
            counter--;
            if (counter < 0){
                break;
            }
        }
        System.out.println("Programm beendet");
    }
}
