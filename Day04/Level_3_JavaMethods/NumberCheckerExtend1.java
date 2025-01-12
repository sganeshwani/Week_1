import java.util.*;

public class NumberCheckerExtend1 {
    // Method to find the count of digits in a number
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length(); // Handles negative numbers
    }

    // Method to store the digits of the number in an array
    public static int[] storeDigits(int number) {
        number = Math.abs(number); // Handle negative numbers
        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find the sum of the digits of a number using the digits array
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits using the digits array
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sumOfSquares = 0;
        for (int digit : digits) {
            sumOfSquares += Math.pow(digit, 2); // Use Math.pow() for squaring
        }
        return sumOfSquares;
    }

    // Method to check if the number is a Harshad number using the digits array
    public static boolean isHarshadNumber(int number) {
        number = Math.abs(number); // Handle negative numbers
        int[] digits = storeDigits(number);
        int sum = sumOfDigits(digits);
        return sum != 0 && number % sum == 0; // Avoid division by zero
    }

    // Method to find the frequency of each digit in the number
    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2]; // 10 rows for digits 0-9, 2 columns (digit and frequency)
        
        // Initialize the first column with the digit (0 to 9)
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }
        
        // Count the frequency of each digit
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        
        return frequency;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Storing the digits of the number in an array
        int[] digits = storeDigits(number);

        // Displaying the count of digits
        System.out.println("Number of digits: " + countDigits(number));

        // Displaying the sum of digits
        System.out.println("Sum of digits: " + sumOfDigits(digits));

        // Displaying the sum of squares of digits
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));

        // Checking and displaying if the number is a Harshad number
        if (isHarshadNumber(number)) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }

        // Displaying the frequency of each digit
        System.out.println("Digit frequencies:");
        int[][] frequencies = digitFrequency(digits);
        for (int i = 0; i < 10; i++) {
            if (frequencies[i][1] > 0) { // Only display digits that appear in the number
                System.out.println("Digit " + frequencies[i][0] + ": " + frequencies[i][1] + " times");
            }
        }
    }
}
