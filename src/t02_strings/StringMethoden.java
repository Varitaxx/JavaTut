package t02_strings;

public class StringMethoden {
    public static void main(String[] args) {
        String str = "International";

        System.out.println("str : " + str);
        System.out.println("str.toString()      : " + str.toString()); //International
        System.out.println("str.length()        : " + str.length()); // 13
        System.out.println("str.charAt(3)       : " + str.charAt(3)); // e
        System.out.println("strindexOf(nat)     : " + str.indexOf("nat")); // 5
        System.out.println("str.substring(2)    : " + str.substring(2)); // ternational
        System.out.println("str.substring(2,7)  : " + str.substring(2,7)); // terna

        System.out.println("str :" + str);
        System.out.println("str.equals(International)           :" + str.equals("International")); // true
        System.out.println("str.equals(INTERNATIONAL)           :" + str.equals("INTERNATIONAL")); // false
        System.out.println("str.equalsIgnoreCase(INTERNATIONAL) :" + str.equalsIgnoreCase("INTERNATIONAL")); //true

        System.out.println("str.contains(nat)       : " + str.contains("nat")); // true
        System.out.println("str.startsWith(Int)     : " + str.startsWith("Int")); // true
        System.out.println("str.endsWith(nal)       : " + str.endsWith("nal")); // true
    }
}
