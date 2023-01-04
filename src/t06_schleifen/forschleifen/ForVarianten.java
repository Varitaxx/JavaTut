package t06_schleifen.forschleifen;

public class ForVarianten {
    public static void main(String[] args) {
        int i = 0;
        for(; i < 5; i+=3){
            System.out.print(i);
        }
        System.out.println();
        System.out.println(i);
        System.out.println("Variante 2");

        i = 0;
        for(; i < 5;){
            System.out.print(i);
            i++;
        }
        System.out.println();
        System.out.println(i);

    }
}
