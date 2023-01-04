package t09_datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormat {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd.MMMM YYYY").withLocale(Locale.US);
        System.out.println(formatter.format(ldt));
    }
}
