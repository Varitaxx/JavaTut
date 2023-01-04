package _falconbyte.arrays;

import java.util.Arrays;

public class BereichKopie {
    public static void main(String[] args) {

        int[] original = {5, 2, 1, 4, 3};
        int[] kopie = Arrays.copyOfRange(original,1,3);
        System.out.println(Arrays.toString(kopie));
    }
}
