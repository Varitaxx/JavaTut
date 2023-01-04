package t05_klassen;

public class Statisch {
    private static int var;

    public static void main(String[] args) {
        setVar(10);

        Statisch obj1 = new Statisch();
        Statisch obj2 = new Statisch();

        obj1.output();
        obj2.output();

    }

    public static void setVar(int aVar){
        var = aVar;
    }

    public void output(){
        System.out.println("var: " + Statisch.var);
    }
}
