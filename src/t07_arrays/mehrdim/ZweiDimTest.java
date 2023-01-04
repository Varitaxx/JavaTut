package t07_arrays.mehrdim;

public class ZweiDimTest {

    public static void main(String[] args) {

        char[][] chars = new char[50][50];

        //Array befüllen
        /*for (int i = 0; i < chars.length; i++) {
            for (int i1 = 0; i1 < chars.length; i1++) {
                chars[i][i1] = '#';
            }
        }*/


        for (int i = 0; i < chars.length; i++) {
            for (int i1 = 0; i1 < chars.length; i1++) {
                chars[i][i1] = '#';
                System.out.print(chars[i][i1] + "\t");
            }
            System.out.println();
        }
    }
}
