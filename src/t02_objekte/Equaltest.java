package t02_objekte;

import java.util.Arrays;
import java.util.List;

public class Equaltest {
    public static void main(String[] args) {

        Object o = new Object();
        o.equals(o); // reflexiv

        List<Integer> al1 = Arrays.asList(1,2,3,4); // fix-size
        List<Integer> al2 = Arrays.asList(1,2,3,4); // fix-size
        List<Integer> al3 = Arrays.asList(1,2,3,4); // fix-size

        System.out.println(al1.equals(al2)); // true
        System.out.println(al1.equals(null)); // false
        System.out.println(al1.hashCode());
        System.out.println(al2.hashCode());
        System.out.println(al3.hashCode());

        System.out.println();

        System.out.println(al1.equals(al1)); // true

        System.out.println();
        System.out.println(al1.equals(al2)); // true
        System.out.println(al2.equals(al1)); // true

        System.out.println();
        System.out.println(al1.equals(al2)); // true
        System.out.println(al2.equals(al3)); // true
        System.out.println(al1.equals(al3)); // true

//		ArrayList<Integer> al = new ArrayList<>();
//		al.equals(al);
//		al.hashCode();
    }
}
