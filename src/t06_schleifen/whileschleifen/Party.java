package t06_schleifen.whileschleifen;

import java.util.Scanner;

public class Party {
    public static void main(String[] args) {

        int guests;
        boolean weiter = true;
        Scanner scan = new Scanner(System.in);

        System.out.println("Anzahl der angemeldeten Gäste: ");
        guests = scan.nextInt();


        while(weiter){
            System.out.println("Gast anmelden(1), abmelden(2), Programm beenden(3)");
            int value = scan.nextInt();

            if (value == 1){
                guests++;
            }
            else if (value == 2) {
                guests--;
            }
            else if (value == 3) {
                weiter = false;
            }
        }
        System.out.println("Anzahl der Gäste: " + guests);
    }
}
