// Program to calculate the mean height of players in a football team
import java.util.Scanner;

class MeanHeight {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Declare an array to store the heights of 11 players
		double[] heights = new double[11];

		// Input the heights of the players
		System.out.println("Enter the heights of 11 players (in cm): ");
		for (int i = 0; i < heights.length; i++) {
			heights[i] = input.nextDouble();
		}

		// Calculate the sum of all heights
		double sum = 0.0;
		for (int i = 0; i < heights.length; i++) {
			sum += heights[i];
		}

		// Calculate the mean height
		double mean = sum / heights.length;

		// Display the mean height
		System.out.println("The mean height of the football team is: " + mean + " cm");
	}
}
