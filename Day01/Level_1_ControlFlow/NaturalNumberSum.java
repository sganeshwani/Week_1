import java.util.*;

public class NaturalNumberSum {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input: Get the number from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is a positive integer
        if (number > 0) {
            // Calculate the sum of the first n natural numbers
            int sum = (number * (number + 1)) / 2;

            // Output the result
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            // If the number is not a natural number, display this message
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}
