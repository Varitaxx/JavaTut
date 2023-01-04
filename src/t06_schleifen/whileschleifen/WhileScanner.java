package t06_schleifen.whileschleifen;

import java.util.Scanner;

public class WhileScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = 1;

        while(value == 1){
            System.out.println("All you need");
            System.out.println("Is Love tonight");
            System.out.println("Erneut abspielen ? ja(1) nein(2)");
            value = scan.nextInt();

        }
        System.out.println("Programm beendet");
    }
}
