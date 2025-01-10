import java.util.*;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Initialize total to 0.0
        double total = 0.0;

        // Infinite while loop to take user input
        while (true) {
            // Prompt the user to enter a number
            System.out.print("Enter a number (enter 0 or a negative number to stop): ");
            double number = input.nextDouble();

            // If the user enters 0 or a negative number, break the loop
            if (number <= 0) {
                break;
            }

            // Add the entered number to the total
            total += number;
        }

        // Display the total sum
        System.out.println("The total sum is: " + total);
    }
}
