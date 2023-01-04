package t06_schleifen.foreach;
import _test.grundklassen.Mitarbeiter;

public class Main2 {
    public static void main(String[] args) {
        
        Mitarbeiter[]mitarbeiterArray = {
                new Mitarbeiter("Peter", 25, 30000,"pass"),
                new Mitarbeiter("Lisa", 43, 60000,"pass"),
                new Mitarbeiter("Hans", 52, 44000,"pass"),
                new Mitarbeiter("Mona", 37, 26000,"pass"),
        };

        for (Mitarbeiter mitarbeiter : mitarbeiterArray) {
            System.out.println(mitarbeiter.getName() + " " + mitarbeiter.getAlter() + " " + mitarbeiter.getJahresgehalt());
            
        }

        System.out.println();

        for (int i = 0; i < mitarbeiterArray.length; i++) {
            System.out.println(mitarbeiterArray[i].getPasswort());
            
        }
    }
}
