package _falconbyte.polymorphie.uebungen2;

public class Planet {
}

class Mars extends Planet{

}

class Earth extends Planet{

}
class Mercury extends Planet{

}
class Venus extends Planet{

}
class Jupiter extends Planet{

}

/*
// Mittle Aufgabe
class Main{
    public static void main(String[] args) {
       Planet p1 = new Earth();
       Planet p2 = new Mars();

       if(p1 instanceof Planet){
           System.out.println("good old blue");
       }
       else{
           Earth e = (Earth)p2;// ClassCastException
       }
    }
}*/
