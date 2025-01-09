import java.util.*;
public class PrimeNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number to check if it is a prime number: ");
        int number = input.nextInt();

        // Prime numbers are greater than 1
        if (number <= 1) {
            System.out.println(number + " is not a Prime Number.");
        } else {
            boolean isPrime = true; // Variable to store the result

            // Loop through numbers from 2 to sqrt(number) for optimization
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // Found a divisor, not a prime number
                    break;
                }
            }

            // Print the result
            if (isPrime) {
                System.out.println(number + " is a Prime Number.");
            } else {
                System.out.println(number + " is not a Prime Number.");
            }
        }
    }
}
