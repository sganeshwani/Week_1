import java.util.*;

public class HarshadNumber {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input: Get the number from the user
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Initialize variables
        int originalNumber = number; // Store the original number
        int sum = 0; // Variable to store the sum of digits

        // While loop to calculate the sum of digits
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            sum += digit; // Add the digit to sum
            number /= 10; // Remove the last digit
        }

        // Check if the original number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }
    }
}
