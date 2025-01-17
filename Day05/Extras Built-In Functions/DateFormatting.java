import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Format 1: dd/MM/yyyy
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Current date in dd/MM/yyyy: " + currentDate.format(format1));

        // Format 2: yyyy-MM-dd
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Current date in yyyy-MM-dd: " + currentDate.format(format2));

        // Format 3: EEE, MMM dd, yyyy
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        System.out.println("Current date in EEE, MMM dd, yyyy: " + currentDate.format(format3));
    }
}
