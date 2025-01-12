import java.util.*;

public class Factors {

    public static void main(String[] args) {
        // Creating scanner object for input
        Scanner input = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Finding factors of the number and store them in an array
        int[] factors = findFactors(number);

        // Finding and displaying the sum of the factors
        int sum = findSum(factors);
        System.out.println("Sum of factors: " + sum);

        // Finding and displaying the sum of squares of the factors
        double sumOfSquares = findSumOfSquares(factors);
        System.out.println("Sum of squares of factors: " + sumOfSquares);

        // Finding and displaying the product of the factors
        long product = findProduct(factors);
        System.out.println("Product of factors: " + product);
    }

    // Method to find factors and store them in an array
    public static int[] findFactors(int number) {
        // First loop to count the number of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Second loop to store the factors in an array
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    // Method to calculate the sum of the factors
    public static int findSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to calculate the sum of squares of the factors
    public static double findSumOfSquares(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    // Method to calculate the product of the factors
    public static long findProduct(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
}