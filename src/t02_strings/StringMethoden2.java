package t02_strings;

public class StringMethoden2 {
    public static void main(String[] args) {
        String str = " Hallo Gabi Tappe ";
        String str2 = " und " ;

        System.out.println("str                             : " + str);
        System.out.println("str.replace(a, u)               : " + str.replace("a", "u"));
        System.out.println("str.replaceFirst(a, u)          : " + str.replaceFirst("a", "u"));
        System.out.println("str.replaceAll(Gabi,  Rudine)   : " + str.replaceAll("Gabi", "Rudine"));
        System.out.println("str.substring(1, 5)   : " + str.substring(1, 5));

        Person person = new Person("Micha", "Tappe");
        String result;
        //result = str.trim() + str2 + person;
        result = str.trim().concat(str2).concat(person.toString());
        System.out.println(result);
    }
}

class Person{
    private String vorname;
    private String nachname;

    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    @Override
    public String toString() {
        return vorname + " " + nachname;
    }
}
