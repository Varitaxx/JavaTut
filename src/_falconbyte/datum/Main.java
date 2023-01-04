package _falconbyte.datum;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate datumX = LocalDate.of(2022,10,20);
        Period period = datumX.until(LocalDate.of(2031,11,9));
        System.out.println("Jahre: " +period.getYears()+ ", Monate: " + period.getMonths()+ ", Tage: " + period.getDays());

        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1963,9,13);
        long p = ChronoUnit.DAYS.between(birthday,today);
        System.out.println(p);
    }
}
