package _oca.test01;

public class Whiz {

    public static void main(String[] args) {
        type(10);
        try {
            type(10.0d);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static void type(int x){
        System.out.print("int");
    }
    public static void type(byte x){
        System.out.print("byte");
    }
    public static void type(float x){
        System.out.print("float");
    }
    public static void type(double x) throws Exception{
        System.out.print("double");
    }
}

