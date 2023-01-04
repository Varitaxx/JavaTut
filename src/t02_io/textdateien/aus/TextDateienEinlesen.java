package t02_io.textdateien.aus;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextDateienEinlesen {
    public static void main(String[] args) {
        File datei = new File("history.txt");
        //Überprüfung ob Source-File vorhanden
        //System.out.println(datei.isFile());
        Scanner scan = null;
        try{
            scan = new Scanner(datei);
        } catch(FileNotFoundException e){
            System.out.println("Datei nicht gefunden");
        }

        while(scan.hasNext()){
        System.out.println(scan.nextLine());
        }

    }
}
