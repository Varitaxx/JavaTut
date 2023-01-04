package t01_generics;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4};
        Double[] doubleArray = {0.2,3.7,6.9};
        Character[] charArray = {'R', 'K', 'M', 'G'};
        auslesen(intArray);

    }

    public static <Type> void auslesen(Type[] typeArray){
        for (Type t : typeArray) {
            System.out.println(t);

        }
    }
}
