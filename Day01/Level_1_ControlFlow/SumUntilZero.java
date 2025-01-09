import java.util.*;

public class SumUntilZero {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Initialize total to 0.0
        double total = 0.0;

        // Variable to store user input
        double number;

        // Use a while loop to continue until the user enters 0
        while (true) {
            // Prompt the user to enter a number
            System.out.print("Enter a number (enter 0 to stop): ");
            number = input.nextDouble();

            // Check if the entered number is 0 to break the loop
            if (number == 0) {
                break;
            }

            // Add the entered number to the total
            total += number;
        }

        // Display the total sum
        System.out.println("The total sum is: " + total);
    }
}
