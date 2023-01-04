package t02_objekte;

public class EqualTest3 {

    public static void main(String[] args) {

        String str1 = new String("Hallo Gabi");
        String str2 = new String("Hallo Gabi");
        String str3 = str1;

        System.out.println(str1 == str2);
        System.out.println(str3 == str1);
        System.out.println(str1.equals(str2));

    }
}
