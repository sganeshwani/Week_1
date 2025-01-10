// Program to find the frequency of each digit in a number using an array
import java.util.*;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for a number
        System.out.print("Enter a number: ");
		
        long number = input.nextLong();

        // Convert number to a string to process each digit
        String numStr = Long.toString(Math.abs(number)); // Handle negative numbers

        // Define a frequency array of size 10
        int[] frequency = new int[10];

        // Loop through the digits and update the frequency array
        for (char digit : numStr.toCharArray()) {
            frequency[digit - '0']++;
        }

        // Display the frequency of each digit
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
    }
}
