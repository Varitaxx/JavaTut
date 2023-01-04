package t02_ausdruecke;

public class Test {

    public static void main(String[] args) {
        int var0 = 1, var1 = 12;
        int var2, var3;

        var2 = var1 + 3;
        var3 = (var2 + var1) % 2; // 27 : 2 = 13 Rest(Modulo) 1
        System.out.println(var3);


        System.out.println("var0 = " + var0);
        System.out.println("var2 = " + var2);
        System.out.println("var3 = " + var3);
        System.out.println("-var0 / var3 = " + (-var0 / var3));
        System.out.println("var2 % var3 = " + (var2 % var3));

        var0 = (-var0/ var3) - (var2 % var3);
        System.out.println("var0 = " + var0);




    }
}
