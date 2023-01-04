package t08_modifier;

public class TestKlasse {

    public static int a;
    public static int b;

    public static void main(String[] args) {

        System.out.println(a + b);

      TestKlasse t = new TestKlasse();
        System.out.println(t.add(a, b));
        System.out.println(t.add(13, 22));
        System.out.println("***************************");
        System.out.println(t.sub(22,13));


    }

    private int add(int a, int b){
        return a + b;
    }

    private int sub(int a, int b){
        return a - b;
    }
}
