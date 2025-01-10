// Program to store numbers in an array until a negative number or 0 is entered, and calculate their sum
import java.util.Scanner;

class StoreNumbersAndSum {
    public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Declare an array and initialize variables
		double[] numbers = new double[10];
		double total = 0.0;
		int index = 0;

		// Input numbers using an infinite loop
		System.out.println("Enter numbers (up to 10). Enter 0 or a negative number to stop:");
		while (true) {
			double number = input.nextDouble();

			// Check if the number is 0 or negative, or if the array is full
			if (number <= 0 || index == 10) {
				break;
			}

			// Store the number in the array and increment the index
			numbers[index] = number;
			index++;
		}

		// Calculate the sum of the numbers
		System.out.println("The numbers entered are:");
		for (int i = 0; i < index; i++) {
			System.out.println(numbers[i]);
			total += numbers[i];
		}

		//Display the total
		System.out.println("The sum of the numbers is: " + total);
    }
}
