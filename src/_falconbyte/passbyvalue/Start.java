package _falconbyte.passbyvalue;

public class Start {
    public static void main(String[] args) {
        Waver w1 = new Waver("w1");
        Waver w2 = new Waver("w2");
        Waver w3 = Waver.combine(w1,w2);

        System.out.println("w1 = " + w1.getName());
        System.out.println("w2 = " + w2.getName());
        System.out.println("w3 = " + w3.getName()); //

    }
}
