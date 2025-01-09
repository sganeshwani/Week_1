import java.util.*;

class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the input value for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("The factors of " + number + " are:");

        // Loop to find and print factors
        for (int i = 1; i <= number; i++) { // Loop from 1 to the number
            if (number % i == 0) { // Check if the number is divisible by i
                System.out.print(i + " "); // Print the factor
            }
        }
    }
}
