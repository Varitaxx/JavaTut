package t06_schleifen.foreach;

public class Continue {
    public static void main(String[] args) {

        //continue
        int[] number = {124,62,521,13,512,95,745};
        int summe = 0;
        // nur alle Zahlen > 100 sollen addiert werden und in summe berechnet werden
        for (int i : number) {
            // alle Zahlen < 100 sollen übersprungen werden
            if(i <= 100){
                continue;
            }
            System.out.println(i + " wurde hinzugefügt");
            summe += i;
        }
        System.out.println("Summe ist gleich: " + summe);

        //**************************************************
        String[] strings = new String[5]; // String-Array mit 5 Positionen
        strings[0] = "Du ";
        strings[2] = "bist ";
        strings[4] = "Hamma";

        // strings[1] und strings[3] sind null!
        for (String string : strings) {
            // Hier "filtern" wir die null-Werte raus.
            if(string == null){
                continue;
            }
            System.out.print(string);

        }

    }
}
