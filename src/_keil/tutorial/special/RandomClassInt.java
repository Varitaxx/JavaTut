package _keil.tutorial.special;
import java.util.Random;

public class RandomClassInt {
    Random random = new Random();
    int wurf;
    int versuche;

    public static void main(String[] args) {
        RandomClassInt rc = new RandomClassInt();

        rc.wuerfelwurf();
        rc.wuerfelwurf(18);
        rc.wuerfelwurf(18,7);





    }
    // Einfacher Wuerfelwurf mit 6seitigem Würfel
    void wuerfelwurf(){
        wurf = random.nextInt(6)+1;
        System.out.println("Dein Wurf: " + wurf);
    }

    // Einfacher Wuerfelwurf mit xseitigem Würfel
    void wuerfelwurf(int seiten){
        wurf = random.nextInt(seiten) +1;
        System.out.println("Dein Wurf: " + wurf);
    }

    // Mehrfacher Wuerfelwürfe mit xseitigem Würfel
    void wuerfelwurf(int seiten, int versuche){
        System.out.println("Du hast " + versuche + " Würfe mit einem " + seiten + "seitigen Würfel");


        for (int i = 1; i <= versuche; i++) {
            wurf = random.nextInt(seiten) +1;
            System.out.println("Der " + i + ".Wurf: " + wurf);
        }
    }

}
