package t05_vererbung.basics;

public class Mensch {

    private String vorname;
    private String nachname;

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void machEtwas(){
        System.out.println("Der Mensch macht etwas...");
    }

    private void print(int x, int y){
        System.out.println(x + y);
    }
}
