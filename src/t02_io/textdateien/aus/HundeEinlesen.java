package t02_io.textdateien.aus;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HundeEinlesen {
    public static void main(String[] args) {

        File datei = new File("dog.txt");

        Scanner scan = null;

        try{
            scan = new Scanner(datei);
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }

        while(scan.hasNext()){
            int alter = scan.nextInt();
            String name = scan.next();
            String art = scan.next();
            String farbe = scan.next();
            //Ausgabe
            System.out.println(name + " " +  alter + " " + art + " " + farbe);

        }
    }
}
