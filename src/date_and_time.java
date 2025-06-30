import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class date_and_time {
    public static void main(String[] args) {
        //LocalDate d=LocalDate.now();
        //System.out.println(d);
        //LocalDate d1=LocalDate.of(2024, Month.FEBRUARY,29);
        // System.out.println(d1);
        //LocalTime t=LocalTime.now();
        //System.out.println(t);
        LocalTime t1 = LocalTime.now(ZoneId.of("US/Pacific"));
        System.out.println(t1);
        for (String i : ZoneId.getAvailableZoneIds()) {
            System.out.println(i);

        }
    }
}

