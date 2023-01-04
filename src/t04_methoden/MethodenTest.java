package t04_methoden;

public class MethodenTest {

    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        int erg = x + y;

        System.out.println(erg);

        int sum = add(x,y);

        System.out.println(sum);


        erg = add(40,22);

        System.out.println(erg);



    }

    public static int add(int a, int b){
        return a + b;
    }
}
