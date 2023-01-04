package t02_io.textdateien.ein;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class InMain {
    public static void main(String[] args) {
        File datei = new File("test123.txt");

        try {
            //FileWriter writer = new FileWriter(datei);//wenn nicht vorhanden, wird Datei erstellt. Daten werden gelöscht und überschrieben
            FileWriter writer = new FileWriter(datei, true);// der zweite Parameter gibt an, ob angehängt werden soll (boolean)
            writer.write("Hallo Datei \n");
            writer.write("Ich bin da \n");
            writer.flush();// schreibt/überträgt tatsächlich in die Datei.
            writer.close(); // Datei wird geschlossen (guter Stil)
        }
        catch (IOException e){
            System.out.println("Datei konnte nicht bearbeitet werden");
        }


    }
}
