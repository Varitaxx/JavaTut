package _falconbyte.schleifen;

public class Uebungen {
    public static void main(String[] args) {
        boolean runs = true;
        int[]values = {10,20,30};

        for (int i = 0; i < 5; i++) {
            while (runs) {
                System.out.println(i);
                if (i > -1) {
                    runs = false;
                }
            }
            System.out.print(i + " ");

        }
        System.out.println();

        // Schwere Aufgabe: Wie oft wird die Zahl 2 (x) ausgegeben? ( 3 mal)
        for (int value : values) {
            int x = 0;
            while(x < values.length){
                System.out.println(x + " " + value);
                x++;
            }

        }
    }
}
