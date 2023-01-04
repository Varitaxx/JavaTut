package t09_datetime;

import java.time.LocalDateTime;
import java.time.*;

public class GeschwindigkeitsTestCPU {
    public static void main(String[] args) {

        long beginn = System.nanoTime();
        for (int i = 0; i < 500000; i++) {
            double x = Math.sin(i);

        }
        long ende = System.nanoTime();
        System.out.println(ende - beginn);

        LocalDateTime ldt = LocalDateTime.now();

        for (int i = 0; i < 500000; i++) {
            double x = Math.sin(i);
        }
        LocalDateTime ldt2 = LocalDateTime.now();
        System.out.println(Duration.between(ldt,ldt2).toNanos());

    }
}
