package t09_datetime;

import java.time.*;

public class Main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2022, Month.DECEMBER,25);
        System.out.println(date);

        LocalTime time = LocalTime.of(16,33,24);
        System.out.println(time);

        LocalDateTime ldt = LocalDateTime.of(1985,12,13,13,13,33);
        System.out.println(ldt);

        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println(ldt1);

        LocalDateTime ldt2 = ldt1.plusMonths(3).plusDays(4).minusHours(23);
        System.out.println(ldt2);

        LocalDateTime ldt4 = LocalDateTime.of(1963,11,22, 12,0,1);
        LocalDateTime ldt5 = LocalDateTime.of(0,1,1,1,1,1);


        System.out.println(ldt.toLocalDate().isLeapYear());
        System.out.println(Duration.between(ldt4,ldt1).toDays());

        System.out.println(Duration.between(ldt5,ldt1).toDays());




    }
}
