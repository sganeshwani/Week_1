import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZones {
    public static void main(String[] args) {
        // Get current time in GMT (Greenwich Mean Time)
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("Current time in GMT: " + gmtTime);

        // Get current time in IST (Indian Standard Time)
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current time in IST: " + istTime);

        // Get current time in PST (Pacific Standard Time)
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Current time in PST: " + pstTime);
    }
}
