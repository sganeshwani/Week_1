// Program to find the multiplication table of a number from 6 to 9
import java.util.Scanner;

class MultiplicationTableRange {
	public static void main(String[] args) {
		//Create a Scanner object
		Scanner input = new Scanner(System.in);

		//Get the number for which the multiplication table will be generated
		System.out.println("Enter a number to find its multiplication table from 6 to 9:");
		int number = input.nextInt();

		//Declare an array to store the multiplication results
		int[] multiplicationResult = new int[4];

		//Calculate the multiplication table from 6 to 9
		for (int i = 6; i <= 9; i++) {
			multiplicationResult[i - 6] = number * i;
		}

		// Display the multiplication table
		System.out.println("Multiplication table of " + number + " from 6 to 9:");
		for (int i = 6; i <= 9; i++) {
			System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
		}
	}
}
