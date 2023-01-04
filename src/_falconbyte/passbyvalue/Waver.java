package _falconbyte.passbyvalue;

public class Waver {
    private String name;

    public Waver(String s){
        name = s;
    }

    public void append(String s){
        name += s;
    }

    public String getName(){
        return name;
    }

    public static Waver combine(Waver a, Waver b){
        a = new Waver("a"); //neues Objekt mit neuer Referenz
        b.append("b"); // an das übergebene Objekt wird ein "b" angehängt. Objekt wird verändert
        return a; // das neue (dritte) Objekt wird ausgegeben
    }
}
