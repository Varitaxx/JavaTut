package _falconbyte.schleifen;

public class verschachtelteSchleifen {
    public static void main(String[] args) {
        char[][]letters ={
                {'a','A','x'},
                {'b','B','y'},
                {'c','C'}
        };

        for (char[] letter : letters) {
            for (int i = 0; i < letter.length; i++) {
                System.out.print(letter[i]+ " " );

            }
            System.out.println();


        }

    }
}
