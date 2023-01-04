package t06_schleifen.forschleifen;

import java.util.Scanner;

public class MainFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wieviele Zahlen möchtest du?");
        int value = scan.nextInt();

        for(int i = 0; i < value; i++){
            System.out.println(i);
        }
    }
}
