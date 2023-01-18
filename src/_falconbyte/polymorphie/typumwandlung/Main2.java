package _falconbyte.polymorphie.typumwandlung;

public class Main2 {
    public static void main(String[] args) {
        Hund h = new Husky();

        if(h instanceof Husky){
            Husky h2 = (Husky) h;
            h2.schlittenZiehen();
        }

    }
}
