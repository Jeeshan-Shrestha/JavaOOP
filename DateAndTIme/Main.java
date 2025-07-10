package DateAndTIme;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main
{
    public static void main(String [] args)
    {
        LocalDateTime date = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
        System.out.println(date + " "+localDate);
        LocalTime time = LocalTime.now();
    }
}
