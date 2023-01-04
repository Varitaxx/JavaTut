package _falconbyte.arraylist;

public class Elch {
    private String name;
    private int alter;

    public Elch(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void roehren(){
        System.out.println("Röööööööööhr");
    }

    @Override
    public String toString() {
        return "Elch{" +
                "name='" + name + '\'' +
                ", alter=" + alter +
                '}';
    }
}
