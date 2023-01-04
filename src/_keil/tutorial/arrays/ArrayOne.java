package _keil.tutorial.arrays;

import t07_arrays.eindim.ArraysCopyOf;

import java.util.Arrays;

public class ArrayOne {

    public static void main(String[] args) {
        int[]arr1 = {2,13,27,49,12,6,45,22,42,11,1,33,4};

        int[]arr2 = Arrays.copyOf(arr1,10);
        int[]arr3 = Arrays.copyOfRange(arr1,2,9);
        System.out.println(Arrays.toString(arr1));
        ArrayOne testarr = new ArrayOne();
        testarr.arrayAusgabe(arr1);
        System.out.println();
        testarr.arrayAusgabe(arr3);
        System.out.println();
        testarr.arraySort(arr1);
        System.out.println();
        testarr.arraySort(arr2);
        System.out.println();
        System.out.println(Arrays.binarySearch(arr1,1));










    }
    void arrayAusgabe(int[]arr){
        System.out.print("[");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("]");
    }
    // Array sortieren und alle Zahlen ausgeben
    void arraySort(int[] arr){
        Arrays.sort(arr);
        System.out.print("[");
        for (int i : arr) {
            System.out.print(i + ", ");

        }
        System.out.print("]");
    }
}
