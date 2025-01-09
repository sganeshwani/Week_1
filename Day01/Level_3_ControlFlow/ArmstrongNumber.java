import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input: Get the number from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize variables
        int originalNumber = number; // Store the original number
        int sum = 0; // Variable to store the sum of cubes of digits

        // While loop to calculate the sum of cubes of digits
        while (originalNumber != 0) {
            int remainder = originalNumber % 10; // Get the last digit
            sum += Math.pow(remainder, 3); // Add the cube of the digit to sum
            originalNumber /= 10; // Remove the last digit
        }

        // Check if the sum equals the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
