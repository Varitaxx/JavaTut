package t05_klassen.t05_klassen_01;

public class Auto {
    private String hersteller;
    private String modell;
    private int baujahr;

    //Getter und Setter
    public String getHersteller() {
        return hersteller;
    }

    public static void main(String[] args) {
        new Auto("Mazda", "6", 2013).ausgabe();
        Auto auto1 = new Auto("Mercedes","C-Klasse", 2018);
        auto1.ausgabe();

    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    // Konstruktor
    public Auto(String hersteller, String modell, int baujahr) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.baujahr = baujahr;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "hersteller='" + hersteller + '\'' +
                ", modell='" + modell + '\'' +
                ", baujahr=" + baujahr +
                '}';
    }
    public void ausgabe(){
        System.out.println("======= Start Objekt ========");
        System.out.println("Hersteller: " + this.getHersteller());
        System.out.println("Modell: " + this.getModell());
        System.out.println("Baujahr: " + this.getBaujahr());
        System.out.println("======== Ende ===============");
        System.out.println();
    }

}

