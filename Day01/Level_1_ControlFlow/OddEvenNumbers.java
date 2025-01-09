import java.util.*;

public class OddEvenNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input: A number to print odd and even numbers up to
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the entered number is a natural number
        if (number < 1) {
            System.out.println("Please enter a natural number greater than 0.");
        } else {
            // Print odd and even numbers from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        }
    }
}
