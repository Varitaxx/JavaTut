package t06_schleifen;

public class ForeachSchleife {
    public static void main(String[] args) {
        //Deklarierung Array der Länge 5
        int viererReihe[] = new int[5];

        //Initialisierung Array mit For-Schleife
        for(int i = 0; i < viererReihe.length; i++){
            viererReihe[i] = (i+1) *4;
        }
        // Ausgabe der einzelnen Elemente des Arrays
        // Greift nur lesend auf Collection(Array) zu
        // Initialisiert kein Array
        for(int i : viererReihe){//for
            System.out.println(i);
        }
        int[] arr1 = {1,2,3,4};
        for(int i : arr1){
            System.out.println(i);
        }
    }
}
