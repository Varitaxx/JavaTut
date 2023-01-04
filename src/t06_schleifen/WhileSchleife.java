package t06_schleifen;

public class WhileSchleife {

    public static void main(String[] args) {
    // Instanzvariablen, innerhalb der main-Methode gültig
        int counter = 0;
        int subCounter;

        // While - Schleife
        while(counter <= 10){
            System.out.println("Zaehler ist bei:" + counter);
            counter++;
        } // Ende While - Schleife
        System.out.println("******************************************");
        // Do-While-Schleife
        counter = 0; //Counter wird hier wieder auf 0 gesetzt
        do{
            System.out.println("Zaehler ist bei:" + counter);
            counter++;
        }
        while(counter <=10);
        // Ende Do-While-Schleife
        System.out.println("******************************************");
        //Verschachtelte While-Schleife
        counter = 0; //Counter wird hier wieder auf 0 gesetzt

        while(counter <= 5){
            System.out.println("Zaehler ist bei:" + counter);
            counter++;

            subCounter = 0; // Startwert
            while(subCounter <= 2){
                System.out.println("Zwischenzähler ist bei:" + subCounter);
                subCounter++;
            }// Ende innere While-Schleife
        } // Ende äußere While - Schleife
    } // Ende main-Methode
}
