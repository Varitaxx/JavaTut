package _oca.test01;

import java.io.IOException;
import java.util.Arrays;

public class Main1 {

    public static void main(String[] args) {
        String str = null;



        Person p1 = new Manager();
        System.out.println();
        Person p2 = new Person();
        System.out.println();
        Manager p3 = new Manager();


    }
}
class Person{
    Person(){
        System.out.print("CP");
    }
    static{
        System.out.print("SP");
    }



}

class Manager extends Person{
    Manager(){
        System.out.print("CT");
    }
    {
        System.out.print("IT");
    }
}


