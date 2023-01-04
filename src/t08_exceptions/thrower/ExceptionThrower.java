package t08_exceptions.thrower;

import java.util.Scanner;

public class ExceptionThrower {
    public void divide(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein: ");
        int number = scan.nextInt();
        if (number == 0){
            throw new ArithmeticException("Nicht durch 0 teilen!!!");
        }
        if (number == 1){
            throw new ArithmeticException("Nicht durch 1 teilen!!!");
        }

        System.out.println(10 / number);
    }
}
