package t08_exceptions.thrower;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        ExceptionThrower exceptionThrower = new ExceptionThrower();
        try{
            exceptionThrower.divide();
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("falscher Wert");
        }catch (Exception e){
            System.out.println("Ein Fehler ist aufgetreten!");
        }

    }
}
