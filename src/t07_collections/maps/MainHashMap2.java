package t07_collections.maps;

import java.util.*;

public class MainHashMap2 {
    public static void main(String[] args) {

        Map<String, String> capitals = new HashMap<>();
        capitals.put("Deutschland", "Bonn");
        capitals.put("Norwegen", "Oslo");
        capitals.put("England", "London");
        capitals.put("USA", "Washington");
        capitals.put("Island", "Reykjavik");
        capitals.put("Taiwan", "Taipeh");
        capitals.put("Griechenland", "Athen");
        capitals.put("Süd-Afrika", "Kapstadt");
        capitals.put("Brasilien", "Brasilia");
        capitals.put("Australien", "Sydney");
        capitals.put("Pakistan", "Islamabad");
        capitals.put("Uruguay", "Montevideo");
        capitals.put("Italien", "Rom");
        capitals.put("Kanada", "Ottwa");
        capitals.put("Schweden", "Stockholm");
        capitals.put("Nigeria", "Abujah");
        capitals.put("Kongo", "Kinshasa");

        //ArrayListe anlegen mit den Keys
        List<String> countries = new ArrayList<>();
        countries.addAll(capitals.keySet());

        //Zufallszahlgenerator
        Random random = new Random();
        //Scanner
        Scanner scan = new Scanner(System.in);
        int zaehler = 0;
        int counter = 10;


        while(true){

            if(counter == 0){
                break;
            }
            int index = random.nextInt(countries.size());
            String country = countries.get(index);
            System.out.println("Was ist die Hauptstadt von " + country);
            if (scan.next().equals(capitals.get(country))){
                System.out.println("Richtig");
                zaehler++;
            }else {
                System.out.println("Leider falsch!");
                System.out.println("Richtig wäre: " + capitals.get(country));
            }
            counter--;

        }
        System.out.println("Du hast " + zaehler + " von 10 Fragen richtig beantwortet");



    }
}
