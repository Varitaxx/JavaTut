package t04_konstruktoren_01;

public class Tier {
    private String art;
    private String name;
    private int alter;

    //public Tier(String art) {
    //    this.art = art;
     //}


    public Tier(String art) {
        this(art,"unbekannt",0);
    }

    public Tier(String art, String name) {
        this.art = art;
        this.name = name;
    }

    public Tier(String art, String name, int alter) {
        this.art = art;
        this.name = name;
        this.alter = alter;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tier{");
        sb.append("art='").append(art).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", alter=").append(alter);
        sb.append('}');
        return sb.toString();
    }
}
