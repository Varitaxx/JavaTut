package _test;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hallo");
        Katze var = new Katze();
        var.sound();
    }
}


 abstract class Tier {
    public void sound(){

    }
}

class Katze extends Tier {
    @Override
    public void sound() {
        System.out.println("Miau");
    }
}
