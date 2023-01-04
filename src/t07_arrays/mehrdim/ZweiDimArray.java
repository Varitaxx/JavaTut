package t07_arrays.mehrdim;

public class ZweiDimArray {
    public static void main(String[] args) {
        String [][]arbeitstageMitInfos = {
                {"Montag","1",":(("},
                {"Dienstag","2",":("},
                {"Mittwoch","3",":|"},
                {"Donnerstag","4",":)"},
                {"Freitag","5",":))"}
        };

        int [][] array = new int[5][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[i + 1];
        }
        System.out.println(array[4][4]);
    }


}
