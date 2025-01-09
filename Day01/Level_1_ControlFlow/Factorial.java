import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input: Integer to calculate the factorial
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the user has entered a positive integer
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Initialize factorial variable
            int factorial = 1;

            // Compute factorial using while loop
            int i = 1;
            while (i <= number) {
                factorial *= i;
                i++;
            }

            // Output the factorial
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
    }
}
