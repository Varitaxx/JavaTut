package _oca.test01;

public class Animal {

    Animal(){
        System.out.println("Es ist ein Tier");
    }
    public void eat() throws Exception{
        System.out.println("Animal eats");
    }
}

class Dog extends Animal{

    Dog(){
        System.out.println("Es ist ein Hund");
    }
    @Override
    public void eat() {
            System.out.println("Dog eats");

    }


    public static void main(String[] args) {
        Animal a = new Dog();
        Dog d = new Dog();
        d.eat();
        try {
            a.eat();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
