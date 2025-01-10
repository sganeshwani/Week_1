import java.util.*;

public class SumNaturalNumbers2 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input: Number to compute the sum of natural numbers
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the user has entered a positive integer
        if (number <= 0) {
            System.out.println("Please enter a natural number greater than 0.");
        } else {
            // Compute sum using for loop
            int sumUsingFor = 0;
            for (int i = 1; i <= number; i++) {
                sumUsingFor += i;
            }

            // Compute sum using the formula
            int sumUsingFormula = number * (number + 1) / 2;

            // Compare the results
            System.out.println("Sum using for loop: " + sumUsingFor);
            System.out.println("Sum using formula: " + sumUsingFormula);

            // Check if both results are correct
            if (sumUsingFor == sumUsingFormula) {
                System.out.println("Both results are correct.");
            } else {
                System.out.println("The results do not match.");
            }
        }
    }
}
