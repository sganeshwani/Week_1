import java.util.*;

class PowerOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get integer input for the base number
        System.out.print("Enter the number/base: ");
        int number = input.nextInt();

        // Get integer input for the power (exponent)
        System.out.print("Enter the power/exponent: ");
        int power = input.nextInt();

        // Initialize the result variable
        int result = 1;

        // Loop to calculate the power
        for (int i = 1; i <= power; i++) {
            result *= number; // Multiply result with number
        }

        // Print the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);
    }
}
