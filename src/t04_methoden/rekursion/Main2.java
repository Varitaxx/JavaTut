package t04_methoden.rekursion;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        //Fakultät 5! = 5 * 4 * 3 * 2 * 1
        System.out.println(fakultät(5));
        System.out.println(fibunacci(2));
        int[] array = {5, 3, 5, 228, 14, 69, 18, 27, 109, 85};
        Arrays.sort(array);
        // Mal das sortierte Array ausgeben ^^
        for (int i : array) {
            System.out.print(i + ", ");

        }
        System.out.println();
        searchBinary(array,0,array.length -1,228);

    }

    public static int fakultät(int zahl){
        System.out.println("So kommt die Zahl rein: " + zahl);
        if((zahl == 0) || (zahl == 1)){
            return 1;
        }
        else {

            return zahl * fakultät(zahl -1);

        }

    }

    public static int fibunacci(int zahl){
        if((zahl == 0) || (zahl == 1)){
            return 1;
        }
        else{
            return fibunacci(zahl - 1) + fibunacci(zahl - 2);
        }
    }

    public static void searchBinary(int[] intArr, int anfang, int ende, int zahl) {

        int grenze = anfang + ((ende - anfang) / 2);

        if (intArr.length == 0) {
            System.out.println("Array leer.");
            return;
        }

        if (grenze >= intArr.length){
            System.out.println(zahl + " nicht im Array enthalten.");
            return;
        }

        if (zahl > intArr[grenze]) {
            //System.out.println(anfang + " " + ende + " " + grenze);
            searchBinary(intArr, grenze + 1, ende, zahl);
        } else if (zahl < intArr[grenze] && anfang != grenze) {
            searchBinary(intArr, anfang, grenze - 1, zahl);
        } else if(zahl == intArr[grenze]) {
            System.out.println(zahl + " an Position " + grenze + " enthalten.");
        } else{
            System.out.println(zahl + " nicht im Array enthalten.");
        }
    }
}
