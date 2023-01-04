public class MethodenAufrufe {
    int nummer;

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public static void main(String[] args) {
        startAusgabe();
        zeilenAusgabe();
        endAusgabe();
    }

    public static void startAusgabe(){
        System.out.println("########### Start ##########");
    }

    public static void zeilenAusgabe(){
        for(int i = 1; i< 10; i++){
            System.out.println("Zeile" + i);
        }
    }

    public static void  endAusgabe(){
        System.out.println("###### Ende ######");
    }
}

