package _falconbyte.objekt;

public class Engage {
    public static void main(String[] args) {

        Object o = new Falcon();

        if(o != null){
            Falcon f = (Falcon) o;
            do{
                f.fly();
            }
            while (f.starts < 3);

            System.out.println(f.starts);
            o = null;
        }
        else{
            System.out.println("The falcon has gone");
            //o.fly();// Objekt kennt Methode fly nicht
        }
    }
}
