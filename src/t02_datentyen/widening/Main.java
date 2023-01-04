package t02_datentyen.widening;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        double dd = 13.22;
        Integer b = a;
        Integer c = 10;
        Double d = 5.66;
        Double ddd = Double.valueOf(c);
        System.out.println(d);
        float e = c;
        System.out.println(e);

    }
}
