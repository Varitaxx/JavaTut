package t02_strings.stringbuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("[");

        List<String> list = new ArrayList<>(Arrays.asList("Peter", "Otto", "Anne", "Lise"));

        if(!list.isEmpty()){
            builder.append(list.get(0)); // Index 0: Peter -> wird hinzugefügt
            list.remove(0); // Index 0: Peter - > wird aus der list entfernt

            while (!list.isEmpty()){
                builder.append(" AND ");
                builder.append(list.get(0)); // Index 0: jetzt Otto -> wird hinzugefügt ==> nächster Durchlauf: 0 -> Anne
                list.remove(0); // Otto wird entfernt ==> nächster Durchlauf: Anne wird entfernt usw.
            }

        }else {
            builder.append("EMPTY LIST!!!");
        }

        builder.append("]");
        builder.insert(6, " AND Rudine");
        //System.out.println(builder);
        System.out.println(builder.toString());
        builder.replace(22,26, "Alf");
        System.out.println(builder.indexOf("Rudine"));
        builder.capacity();

        System.out.println(builder.toString());
        System.out.println(builder.capacity());
        StringBuilder builder1 = new StringBuilder("ABCDEFGHIJKLMNOPQ RSTUVWXYZ");
        builder1.append("abcd");
        System.out.println(builder1.toString());

        builder1.notify();
        System.out.println(builder1.toString());


    }
}
