package t07_arrays;

public class ArrayTest2 {
    public static void main(String[] args) {

        int[]arr;
        arr = new int[4];
        arr[0]= 65;
        arr[1]= 5;
        arr[2]= 78;
        arr[3]= 22;

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }


    }
}
