package _falconbyte.garbage;

public class Tiger {
    private String name;
    private int alter;

    public Tiger(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }
    @Override
    protected void finalize(){
        System.out.println("Objekt wurde vom GC vernichtet");
    }

    public static void main(String[] args) {
       Tiger eins = new Tiger("Clerence", 15);
       Tiger zwei = new Tiger("Roy", 11);
       Tiger drei = eins;
       eins = null;
       Tiger vier = eins;
       drei = null;
       zwei = null;
       zwei = new Tiger("Siegfried", 10);

       System.out.println(zwei.name + " " + zwei.alter);
       //System.out.println(vier.name + " " + vier.alter);
       System.gc();
    }


}
