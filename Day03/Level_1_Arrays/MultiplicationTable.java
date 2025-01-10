//Program to print multiplication table of a number

import java.util.*;

public class MultiplicationTable {
	public static void main (String[] args) {
		//Create scanner object
		Scanner input = new Scanner(System.in);
		 
		//Get the number for the multiplication table
		System.out.println("Enter a number to print its multiplication table: ");
		int number = input.nextInt();

		//Define an array to store the multiplication results
		int[] results = new int[10];

		//Calculate and store the multiplication table
		for (int i = 1; i <= 10; i++) {
			results[i - 1] = number * i;
		}

		//Display the multiplication table
		System.out.println("Multiplication table of " + number + ":");
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " * " + i + " = " + results[i - 1]);
		}
	}
}