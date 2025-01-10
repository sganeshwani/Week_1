import java.util.*;

public class DayOfWeek {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input: Get month, day, and year from the user
        System.out.print("Enter the month (1 for January, 2 for February, ...): ");
        int m = input.nextInt();
        System.out.print("Enter the day: ");
        int d = input.nextInt();
        System.out.print("Enter the year: ");
        int y = input.nextInt();

        // Calculate intermediate values based on the formula
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Output the day of the week
        System.out.println("The day of the week is: " + d0);
        System.out.println("0 = Sunday, 1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 = Friday, 6 = Saturday");
    }
}
