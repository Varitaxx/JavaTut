package t08_modifier.statics;

public class Katze {
     static String farbe = "weiß";
     static int alter = 5;

    public Katze() {
    }

    public void getFarbe() {
        System.out.println(farbe);
    }

    public void setFarbe(String neueFarbe) {
        farbe = neueFarbe;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
}
