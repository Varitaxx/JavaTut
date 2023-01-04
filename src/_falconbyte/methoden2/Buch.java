package _falconbyte.methoden2;

public class Buch {
    private String autor;
    private String titel;
    private String bewertung;
    private int ausgeliehen = 0;

    public Buch() {
        autor = "Gariele M.K. Tappe";
        titel = "Eva war es nicht";
    }

    public String getAutor() {
        return autor;
    }

    public String getTitel() {
        return titel;
    }

    public String getBewertung() {
        return bewertung;
    }

    public void setBewertung(String bewertung) {
        this.bewertung = bewertung;
    }

    public void informationen(){
        System.out.println("Autor: " + getAutor());
        System.out.println("Titel: " + getTitel());
        System.out.println("Bewertung : " + getBewertung());
    }
    public void ausleihen(){
        ausgeliehen++;
    }

    public void ausleihen(int anz){
        ausgeliehen = anz;
    }
}
