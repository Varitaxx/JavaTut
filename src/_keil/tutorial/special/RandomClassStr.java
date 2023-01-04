package _keil.tutorial.special;
import java.util.Random;

public class RandomClassStr {
    Random rand = new Random();
    int nameIndex;
    String[] strArray = new String[]{"Gabi", "Micha","Rudine","Rudolph","Bertram", "Bört", "Nelly", "Kessy"};

    public static void main(String[] args) {
        String[] strNamen = new String[]{"Garbie", "Micher","Rutine","Radalph","Pertram", "Pört", "Nälly", "Kässy", "Shellie"};
        RandomClassStr classStr = new RandomClassStr();

        classStr.namenSuchen();
        classStr.namenSuchen(strNamen);
        classStr.namenSuchen(strNamen, 2);



    }
    // Einen Namen aus Array ausgeben ohne Übergabeparameter
    void namenSuchen(){
        nameIndex= rand.nextInt((strArray.length));

        System.out.println(strArray[nameIndex] + " "+ nameIndex);

    }
    // Einen Namen aus Array ausgeben mit Array als Übergabeparameter
    void namenSuchen (String[] strArr){
        nameIndex= rand.nextInt((strArr.length));
        System.out.println(strArr[nameIndex] + " "+ nameIndex);
    }
    // Array und Anzahl der auszugebenen Werte
    void namenSuchen (String[] strArr, int anz){

        for (int i = 0; i < anz; i++) {
            nameIndex= rand.nextInt((strArr.length));
            System.out.print(strArr[nameIndex] + " ");



        }
    }
}
