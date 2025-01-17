import java.time.LocalDate;

public class DateArithmetic {
    public static void main(String[] args) {
        // Take a date as input
        LocalDate inputDate = LocalDate.of(2023, 1, 16); // Example date: 16th January 2023

        // Add 7 days, 1 month, and 2 years
        LocalDate newDate = inputDate.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("Date after adding 7 days, 1 month, and 2 years: " + newDate);

        // Subtract 3 weeks from the result
        LocalDate finalDate = newDate.minusWeeks(3);
        System.out.println("Date after subtracting 3 weeks: " + finalDate);
    }
}
