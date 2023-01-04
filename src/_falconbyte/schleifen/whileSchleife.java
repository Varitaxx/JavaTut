package _falconbyte.schleifen;

public class whileSchleife {
    public static void main(String[] args) {
        int number = 0;

        while(number != 6){
            number = (int)((Math.random()*6)+1);
            System.out.print(number + " ");

        }
        System.out.println();
        do {
            number = (int)((Math.random()*6)+1);
            System.out.print(number + " ");
        }
        while (number !=6);
    }
}
