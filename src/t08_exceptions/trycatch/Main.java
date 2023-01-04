package t08_exceptions.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Eingabe:");
            int number = scanner.nextInt();
            System.out.println("Ausgabe: " + number);
        }catch (InputMismatchException e){
            System.out.println("Das war ein falscher Wert");
        } finally {
            scanner.close();
            System.out.println("Scanner geschlossen");
        }
    }
}
