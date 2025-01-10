import java.util.*;

public class AbundantNumber {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input: Get the number from the user
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Initialize sum to store the sum of divisors
        int sum = 0;

        // Loop to find all divisors and add them to the sum
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // Check if i is a divisor
                sum += i;
            }
        }

        // Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }
    }
}
