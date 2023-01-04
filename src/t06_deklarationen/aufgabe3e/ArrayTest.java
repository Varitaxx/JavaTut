package t06_deklarationen.aufgabe3e;

public class ArrayTest {
    static double[] zahlen = {4.5, 78, 23.9, 12.7, 88};
    public static void main(String[] args) {
        System.out.println("==============================");
        loesung1();
        loesung2();
        loesung3();
        loesung4();
        System.out.println("=========== end of main ============");
        formatTest();



    }

    private static void loesung1(){
        double summe = 0;

        for (double zahl : zahlen){
            summe += zahl;
        }
        System.out.format("summe: %.2f %n", summe);


        double plusMinus = 0;
        for (int i = 0; i < zahlen.length;i++){
            if (i % 2 == 0)
                plusMinus += zahlen[i];
            else
                plusMinus -= zahlen[i];
        }
        System.out.println("===== Lösung 1 =====");
        System.out.format("Plus-Minus Summe: %.2f %n", plusMinus);

    }

    private static void loesung2() {
        double summe = 0;
        double plusMinus = 0;

        for (int i = 0; i < zahlen.length; i++) {
            if (i % 2 == 0) // wenn i gerade Zahl ist
                plusMinus += zahlen[i];
            else
                plusMinus -= zahlen[i];
            summe += zahlen[i];

        }
        System.out.println("===== Lösung 2 =====");
        System.out.format("Reguläre Summe : %.2f %n", summe);
        System.out.format("Plus-Minus Summe: %.2f %n", plusMinus);
    }

    private static void  loesung3(){
        double summe = 0;
        double plusMinus = 0;
        int i = 0; // Zählvariable für die Iterationen von zahlen

        for(double zahl : zahlen){

            if(i % 2 == 0)
                plusMinus += zahl;

            else
                plusMinus -= zahl;


            summe += zahl;
            i++;
        }
        System.out.println("===== Lösung 3 =====");
        System.out.format("Reguläre Summe : %.2f %n", summe);
        System.out.format("Plus-Minus Summe: %.2f %n", plusMinus);
    }

    private static void loesung4(){
        double summe = 0;
        double plusMinus = 0;
        int i = 0; // Zählvariable für die Iterationen von zahlen
        for (double zahl : zahlen){
            plusMinus = plusMinus + (i % 2 == 0 ? +zahl : -zahl); //Ternärer Operator
            summe += zahl;
            i++;
        }
        System.out.println("===== Lösung 4 =====");
        System.out.format("Reguläre Summe : %.2f %n", summe);
        System.out.format("Plus-Minus Summe: %.2f %n", plusMinus);
    }




    private static void formatTest(){
        String name = "Peter";
        int alter = 34;
        System.out.format("Mein Name ist %s. Ich bin %d Jahre alt. %n", name, alter );
    }
}
