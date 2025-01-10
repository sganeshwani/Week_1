// Program to find factors of a number and store them in an array
import java.util.Scanner;

class FactorsOfNumber {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Get the number from the user
		System.out.println("Enter a number to find its factors: ");
		int number = input.nextInt();

		// Check if the number is valid
		if (number <= 0) {
			System.out.println("Error: Please enter a positive number.");
			return;
		}

		// Initialize the array and variables
		int maxFactor = 10;
		int[] factors = new int[maxFactor];
		int index = 0;

		// Find factors of the number
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
            // Check if more space is needed in the array
            if (index == maxFactor) {
               // Double the array size
               maxFactor *= 2;
               int[] temp = new int[maxFactor];
               System.arraycopy(factors, 0, temp, 0, factors.length);
               factors = temp;
            }
            // Add the factor to the array
			factors[index++] = i;
			}
		}

		// Display the factors
		System.out.println("The factors of " + number + " are:");
		for (int i = 0; i < index; i++) {
			System.out.print(factors[i] + " ");
		}
		System.out.println();
	}
}
