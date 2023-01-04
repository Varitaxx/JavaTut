package t07_collections.listen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Einkaufsliste {
    public static void main(String[] args) {
        List<String> einkaufsliste = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Brauchen wir noch etwas? [j/n]");
            String s = scanner.next();
            if(s.equals("j")){
                System.out.println("Was brauchen wir noch?");
                String produkt = scanner.next();
                einkaufsliste.add(produkt);
            }else if(s.equals("n")){
                System.out.println("Hier ist die Einkaufsliste: ");
                for (String produkt : einkaufsliste) {
                    System.out.println(produkt);
                }
                break;
            }
        }

    }
}
