package t07_arrays.eindim;

public class ArrayDurchschnitt {
    public static void main(String[] args) {

        double[] ergebnisse = {7.3, 2.6, 4.5, 5.7, 3.3, 9.8};
        double sum = 0;

        for(int i = 0; i < ergebnisse.length; i++){
            sum += ergebnisse[i];
        }
        System.out.println(sum/ ergebnisse.length);
    }
}
