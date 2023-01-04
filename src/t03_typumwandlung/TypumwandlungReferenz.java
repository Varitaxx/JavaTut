package t03_typumwandlung;
/*
 * Beispielanwendung implizite und explizite Referenz-Typumwandlung in Java.
 */
import java.util.Vector;

public class TypumwandlungReferenz{
    public static void main(String[] args) {

        Object obj = new Object();
        String str = new String("Ein String-Objekt");

        System.out.println("\nobj:    " + obj);

        obj = str;

        System.out.println("\nobj:    " + obj);
        System.out.println("str:    " + str);


        obj = new Object();
//str = obj; // Compilerfehler: incompatible types
//str = (String) obj; // Laufzeitfehler: ClassCastException


// impl. Typumwandlung String -> Object (in Richtung der Vaterklasse)
        Object objStr = new String("String-Objekt mit Object-Typ Referenz");

        System.out.println("\nobjStr: " + objStr);


//str = objStr; // Compilerfehler: incompatible types
        str = (String) objStr; // nur möglich, da objStr eigentlich ein
// String-Objekt ist

        System.out.println("\nstr:    " + str);


        Vector vec = new Vector();
        str = new String ("Ein neues String-Objekt");

//vec = str; // Compilerfehler: incompatible types
//vec = (Vector) str; // Compilerfehler: incompatible types, da Vector
// und String nicht direkt miteinander verwandt

    }
}
