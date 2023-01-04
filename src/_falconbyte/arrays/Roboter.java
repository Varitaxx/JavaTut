package _falconbyte.arrays;

public class Roboter implements Comparable{

    private String name;
    private int energie;

    public Roboter(String name, int energie) {
        this.name = name;
        this.energie = energie;
    }

    public int getEnergie() {
        return energie;
    }

    @Override
    public String toString() {
        return "Roboter{" + "name='" + name + '\'' + ", energie=" + energie + '}';
    }

    //Nach Energie sortiert //Sort-Reihenfolge -1, 0, 1
    @Override
    public int compareTo(Object o) {
        Roboter other = (Roboter) o;
        if(this.getEnergie() > other.getEnergie()){
            return 1;
        } else if (this.getEnergie()< other.getEnergie()) {
            return -1;
        }
        else {
            return 0;
        }
    }

   /* //Nach Namen sortiert:
    @Override
    public int compareTo(Object o) {

        Roboter other = (Roboter) o;

        return toString().compareTo(o.toString());

    }*/


}
