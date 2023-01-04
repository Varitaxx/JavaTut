package _falconbyte.objektinteraktionen;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Verein {
    private ArrayList<Mitglied> mitgliederListe;
    private Mitglied m1;
    private Mitglied m2;
    private Mitglied m3;
    private Mitglied m4;

    public Verein() {
        mitgliederListe = new ArrayList<>();
        m1 = new Mitglied("Rudine", 2001);
        m2 = new Mitglied("Shelly", 2007);
        m3 = new Mitglied("Kessy", 2011);
        m4 = new Mitglied("Bieny", 1998);

        mitgliederListe.add(m1);
        mitgliederListe.add(m2);
        mitgliederListe.add(m3);
        mitgliederListe.add(m4);
    }

    public void mitgliederAnzeigen(int jahr){
        System.out.println("Mitglieder, die seit " + jahr + " im Verein sind:");
        for(Mitglied sV : mitgliederListe){
            if(sV.getBeitritt() >= jahr){
                System.out.println(sV.getName() + "(" + sV.getBeitritt() + ")");
            }
        }
    }
}
