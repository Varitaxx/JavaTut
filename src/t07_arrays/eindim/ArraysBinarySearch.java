package t07_arrays.eindim;
import java.util.Arrays;

public class ArraysBinarySearch {
    public static void main(String[] args) {

        int[]ints = {2,-1,4,5,3};
        Arrays.sort(ints);
        System.out.println(Arrays.binarySearch(ints, -1));
    }

}
