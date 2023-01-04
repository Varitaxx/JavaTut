package _falconbyte.initializer;

public class Cat {
    private String name = "Simba";

    public Cat(){
        name = "Zammis";
        System.out.println("Ich bin der Konstruktor");
    }
    {
        System.out.println("Ich bin der Instanz-Initializer");
    }
    static {
        System.out.println("Ich bin der Static-Initializer");
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        Cat c1 = new Cat();
        System.out.println(c.name);
        System.out.println(c1.name);
    }
    static {
        System.out.println("Static 2");
    }
}
