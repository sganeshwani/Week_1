import java.util.*;

public class AthleteRoundsCalculator{
    // Method to calculate the perimeter of the triangle
    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    // Method to calculate the number of rounds
    public static int calculateRounds(double perimeter) {

        double distanceToRun = 5000;

        // Calculate the number of rounds
        return (int) Math.ceil(distanceToRun / perimeter);
    }
	
	// Main function
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the sides of the triangle
        System.out.print("Enter the length of the first side: ");
        double side1 = input.nextDouble();

        System.out.print("Enter the length of the second side: ");
        double side2 = input.nextDouble();

        System.out.print("Enter the length of the third side: ");
        double side3 = input.nextDouble();

        // Compute the perimeter
        double perimeter = calculatePerimeter(side1, side2, side3);

        int rounds = calculateRounds(perimeter);

        // Display the result
        System.out.println("The athlete needs to complete " + rounds + " rounds to cover 5 km.");
    }
}
