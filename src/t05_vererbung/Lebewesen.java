package t05_vererbung;

public class Lebewesen {
    int alter;
    double größe;

    public void fortPfanzen(){
        System.out.println("Fortpflanzen....");
    }

    public void wachsen(){
        this.größe++;
    }
}
