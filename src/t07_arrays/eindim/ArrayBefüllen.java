package t07_arrays.eindim;

public class ArrayBefüllen {
    public static void main(String[] args) {

        int [] arr = new int[50]; //Ein int-Array mit 50 Positionen wird erstellt

        // Array befüllen
        for(int i = 0; i < arr.length; i++){
            //arr[i] = i + 1; // + 1: wenn man statt mit 0 mit 1 beginnen möchte (1 -> 50)
            arr[i] = i * i; //so kann man sich die Quadratzahlen ausgeben lassen
        }
        // Inhalt Array ausgeben
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}
