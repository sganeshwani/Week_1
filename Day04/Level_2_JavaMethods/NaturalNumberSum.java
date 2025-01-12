import java.util.*;

public class NaturalNumberSum {

    public static void main(String[] args) {
        //Creating scanner object for input
        Scanner input = new Scanner(System.in);

        //Taking user input for the number
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        //Checking if the number is a natural number (positive integer)
        if (n <= 0) {
            System.out.println("Please enter a valid natural number greater than 0.");
            return; //Exit if the input is not a natural number
        }

        //Calling the method to find the sum using recursion
        int recursiveSum = sumUsingRecursion(n);

        //Calling the method to find the sum using the formula
        int formulaSum = sumUsingFormula(n);

        //Comparing both results and display them
        System.out.println("Sum of the first " + n + " natural numbers (using recursion): " + recursiveSum);
        System.out.println("Sum of the first " + n + " natural numbers (using formula): " + formulaSum);

        //Checking if both sums are equal
        if (recursiveSum == formulaSum) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("The results do not match, something went wrong.");
        }
    }

    //Method to calculate the sum of first n natural numbers using recursion
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumUsingRecursion(n - 1);
        }
    }

    //Method to calculate the sum of first n natural numbers using the formula
    public static int sumUsingFormula(int n) {
        return n*(n + 1)/2; //Formula for the sum of first n natural numbers
    }
}