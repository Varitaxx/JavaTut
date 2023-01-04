package t00_zahlensysteme.hexa;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        // Hexazahl beginnt mit ner führenden 0 (Basis ist 16) gefolgt von einem x. Bereich von 0...f
        //1 - 16 - 256 - 4096 - 1048576....

        int hZ1 = 0x1;
        int hZ2 = 0xd;
        int hZ3 = 0xff;

        System.out.println(hZ1);
        System.out.println(hZ2);
        System.out.println(hZ3);
        System.out.println(Math.pow(16,5));

    }
}
