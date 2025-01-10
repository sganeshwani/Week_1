import java.util.*;

class ReverseNumber{
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Handle the case for negative numbers
        if (number < 0) {
            System.out.println("Invalid input. Enter a positive number.");
            return;
        }

        // Find the count of digits in the number
        int count = 0, temp = number;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Create an array to store the digits of the number
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10; // Extract the last digit
            number /= 10;           // Remove the last digit
        }

        // Create an array to store the digits in reverse order
        int[] reversedArray = new int[count];
        for (int i = 0; i < count; i++) {
            reversedArray[i] = digits[i];
        }

        // Display the elements of the reversed array
        System.out.print("Reversed Number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reversedArray[i]);
        }
    }
}
