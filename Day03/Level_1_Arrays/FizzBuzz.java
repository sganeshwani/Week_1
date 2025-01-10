// Program to implement FizzBuzz and store results in an array
import java.util.Scanner;

class FizzBuzz {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Take user input for the number
		System.out.println("Enter a positive integer: ");
		int number = input.nextInt();

		// Check if the input is a positive integer
		if (number <= 0) {
			System.out.println("Error: Please enter a positive integer.");
			return;
		}

		// Create a String array to store the results
		String[] results = new String[number + 1];

		// Loop from 0 to the number and determine Fizz, Buzz, or FizzBuzz
		for (int i = 0; i <= number; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				results[i] = "FizzBuzz";
			} else if (i % 3 == 0) {
				results[i] = "Fizz";
			} else if (i % 5 == 0) {
				results[i] = "Buzz";
			} else {
				results[i] = String.valueOf(i);
			}
		}

		// Display the results
		System.out.println("FizzBuzz Results:");
		for (int i = 0; i <= number; i++) {
			System.out.println("Position " + i + " = " + results[i]);
		}
	}
}
