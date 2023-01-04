package t04_methoden;

public class Main2 {

    public static void main(String[] args) {

        double a = 22;
        double b = 13;
        //Variable wird ein Methodenaufruf mit Parametern zugewiesen
        double difference = diff(10,5);
        double difference2 = diff(a,b);

        System.out.println(difference);
        System.out.println(difference2);

    }


    public static void method (boolean check, long seed, char key){
        // do something
    }

    public static double diff(double x, double y){
        return x - y;
    }
}
