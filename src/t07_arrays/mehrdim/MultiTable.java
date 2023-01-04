package t07_arrays.mehrdim;

public class MultiTable {
    public static void main(String[] args) {

        String [][] multTable = new String[10][10];

        for (int i = 0; i < multTable.length; i++) {
            for (int y = 0; y < multTable.length; y++) {
                multTable[i][y] = (i + 1) + " x " +  (y + 1) + " = " + (i + 1)  * (y + 1);
                System.out.print(multTable[i][y] + "\t");
            }
            System.out.println();
            System.out.println();

        }

    }
}
