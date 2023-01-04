package t05_vererbung.basics;

import java.util.ArrayList;
import java.util.List;

public class VererbungsTest {

    public static void main(String[] args) {

        Mensch m1 = new Mensch();
        m1.machEtwas();

        Mensch m2 = new Student();
        m2.setVorname("Peter");
        System.out.println(m2.getVorname());
        m2.machEtwas();



        m2 = new Rentner();
        m2.setVorname("Carol");
        System.out.println(m2.getVorname());
        m2.machEtwas();

        Student s1 = new Student();
        s1.setVorname("Rudolph");
        System.out.println(s1.getVorname());
        s1.tuNix();

        // Soll Studenten, Rentner und Menschen enthalten
        List<Mensch> gruppe = new ArrayList<>();
        // Alle Objekte müssen Instanzen von Kindklassen von Mensch sein, oder direkt von Mensch. stehen in einer IS-A-Beziehung
        gruppe.add(new Student());
        gruppe.add(new Student());
        gruppe.add(new Rentner());
        gruppe.add(new Mensch());
        gruppe.add(new Student());
        gruppe.add(new Rentner());

        for(Mensch m : gruppe) {
            if(m instanceof Student) // Prüft ob es ein Student ist
                runMachWas(m); // Hier kann ich alles nutzen, was alle Menschen gemeinsam haben
        }

        // Vererbung gibt mir die Möglichkeit der Kompatibilität
        // auf Kosten der Einzigartigkeit
        // d.h. Komplatibilität konzentriert sich auf "Dinge" die alle gemeinsam haben

        // Aufgabe:
        // Schreibe eine Elternkasse für Roboter welche eine Bezeichnung und preis enthält
        // sowie die Möglichkeit der Fortbewegung
        // Schreibe zwei Kindklassen RaupenRoboter und RadRoboter, die die Fortbewegung an ihre Möglichkeiten anpassen


    }

	/*
	// st ist frei wählbar, ist als Variable NUR in der Methode verfügbar
	public static void runMachWas(Student obj) {
		obj.machEtwas();
	}

	// Für andere Typen muss die Methode noch eingebaut werden
	public static void runMachWas(Rentner obj) {
		obj.machEtwas();
	}
	*/

    // Diese ist mit Mensch und allen Kindklassen von Mensch komplatibel
    public static void runMachWas(Mensch obj) {
        obj.machEtwas(); // die machWas-Methode wird auf dem Original-Typ auf dem Heap ausgeführt
    }


}
