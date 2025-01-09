import java.util.*;

public class CountDigits {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input: Get the number from the user
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Initialize count variable to 0
        int count = 0;

        // Handle the case for 0
        if (number == 0) {
            count = 1; // 0 has one digit
        } else {
            // Loop to count digits
            while (number != 0) {
                number /= 10; // Remove the last digit
                count++; // Increment the count
            }
        }

        // Display the number of digits
        System.out.println("The number of digits is: " + count);
    }
}
