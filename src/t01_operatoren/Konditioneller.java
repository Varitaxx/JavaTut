package t01_operatoren;
import _test.grundklassen.Taschenrechner;

public class Konditioneller {
    public static void main(String[] args) {
        //Konditionelle Operatoren

        String message = "Hello Computer";

        if (message.startsWith("Hello")){
            System.out.println("Hey");
        }
        else {
            System.out.println("Weiß ich nicht...");
        }

        // boolean (Bedingung ? (wahr) : (falsch)
        System.out.println(message.startsWith("Hello")? "Hey" : "Weiß ich nicht...");

        String s = message.startsWith("Hello")? upper("Hey" ): "Weiß ich nicht...";
        System.out.println(s);

        System.out.println("Neues Beispiel");

        int i = 7;

        System.out.println(i < 4 ? "Kleiner als 4" : i == 4 ? "Gleich 4" : "Größer als 4");

        System.out.println("Mit Taschenrechner");
        int j1 = 4;
        int j2 = -6;

        System.out.println(Taschenrechner.max(j1,j2));
        System.out.println(Taschenrechner.abs(j2));


    }


    public static String upper (String s){
        return s.toUpperCase();
    }
}
