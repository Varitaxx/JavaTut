package _falconbyte.polymorphie.typumwandlung;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Husky h1 = new Husky();
        Schaeferhund h2 = new Schaeferhund();
        Mops h3 = new Mops();

        ArrayList<Hund> hunde =new ArrayList<>();
        hunde.add(h1);
        hunde.add(h2);
        hunde.add(h3);

        for (Hund hund : hunde) {
            hund.bellen();
        }

        Hund h = new Schaeferhund();
        Schaeferhund hx = (Schaeferhund) h;

        Husky h4 = new Husky();
        Hund hy = h4;
        hy.bellen();


    }
}
