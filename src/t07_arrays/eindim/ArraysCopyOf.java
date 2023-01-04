package t07_arrays.eindim;
import java.util.Arrays;
public class ArraysCopyOf {
    public static void main(String[] args) {
        int[]arr1 = {1,2,3,4,5};
        int[]arr2 = Arrays.copyOf(arr1,6); // mehr Plätze als das Original möglich
        arr2[5] = 9; // hier kann ein Wert optional zugeordnet werden, weil arr2 6 Plätze hat, default = 0
        arr2[3] = 7; // natürlich kann man auch neue Werte zuteilen.

        for (int i : arr2) {
            System.out.println(i);

        }
    }
}
