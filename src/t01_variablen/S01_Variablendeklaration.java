package t01_variablen.variablendeklaration;

public class S01_Variablendeklaration {
    // Nicht-lokale Variablen: haben immer einen Defaultwert
    // [Zugriffsmodifizierer] [Nicht-Zugriffsmodifizierer] *  <type> <variablen name> [= ausdruck];
    // public                   static transient                int     zahl            = 12 *5;
    int nichtLokaleVar = 12;
    float flzahl1 = 30.5f;
    public static final double PI = 3.14;



    public void someMethod(){
        // Lokale Variablen
        // [final] <type> <variablen name> [= ausdruck];
        //          int     zahl            = 12 * 5;
        int lokaleVar = 32;
    }
}
