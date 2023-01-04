package t02_objekte;

public class Equaltest2 {
    public static void main(String[] args) {
        Person p1 = new Person("Rudine","Sternchen");
        Person p2 = new Person("Rudine","Sternchen");
        Person p3 = new Person("Rudine");
        Person p4 = new Person("Rudine");

        String str1 = new String("Hallo Eddy");
        String str2 = new String("Hallo Eddy");



        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1 == p2);
        System.out.println(p3.hashCode());
        System.out.println(p4.hashCode());
        System.out.println(p1.equals(p2));
        System.out.println(str1.equals(str2));
        p2 = p1;
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
    }
}

 class Person{
    private String vorname;
    private String nachname;

     public Person(String vorname) {
         this.vorname = vorname;
     }

    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }


}
