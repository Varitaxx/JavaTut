package t02_io;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String input;
        int var;
        Scanner scan = new Scanner(System.in);

        System.out.println("Dein Name:");
        input = scan.nextLine();
        System.out.println("Dein Alter");
        if(scan.hasNextInt()) {
            var = scan.nextInt();
            System.out.println("Ausgabe:");
            System.out.println("Dein Name lautet: " + input);
            System.out.println("Du bist " + var + " Jahre alt.");
        }
        else {
            System.out.println("Ausgabe:");
            System.out.println("Dein Name lautet: " + input);
            System.out.println("Alter muss eine Ganzzahl sein");
        }





    }
}
