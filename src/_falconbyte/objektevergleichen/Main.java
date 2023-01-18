package _falconbyte.objektevergleichen;

public class Main {
    public static void main(String[] args) {
        Point one = new Point(5,5);
        Point two = new Point(5,5);
        Point three = one;

        System.out.println(one == two);
        System.out.println(one == three);
        System.out.println(one.equals(two));
    }
}
