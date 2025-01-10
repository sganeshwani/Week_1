// Program to save odd and even numbers into separate arrays and display them
import java.util.Scanner;

class OddEvenArrays {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Get the number from the user
		System.out.println("Enter a natural number: ");
		int number = input.nextInt();

		// Check if the input is a natural number
		if (number <= 0) {
			System.out.println("Error: Please enter a natural number greater than 0.");
			return;
		}

		// Calculate the maximum size for odd and even arrays
		int maxSize = number / 2 + 1;

		// Declare arrays to store odd and even numbers
		int[] oddNumbers = new int[maxSize];
		int[] evenNumbers = new int[maxSize];

		// Initialize indices for odd and even arrays
		int oddIndex = 0, evenIndex = 0;

		// Iterate from 1 to the number and categorize as odd or even
		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				evenNumbers[evenIndex++] = i;
			} else {
				oddNumbers[oddIndex++] = i;
			}
		}

		// Display the odd numbers
		System.out.println("Odd Numbers:");
		for (int i = 0; i < oddIndex; i++) {
			System.out.print(oddNumbers[i] + " ");
		}
		System.out.println();

		// Display the even numbers
		System.out.println("Even Numbers:");
		for (int i = 0; i < evenIndex; i++) {
			System.out.print(evenNumbers[i] + " ");
		}
		System.out.println();
	}
}
