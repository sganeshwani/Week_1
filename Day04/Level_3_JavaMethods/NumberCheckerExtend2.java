import java.util.*;
public class NumberCheckerExtend2 {

    // Method to find the count of digits in a number
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store the digits of the number in an array
    public static int[] storeDigits(int number) {
        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversedDigits = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversedDigits[i] = digits[digits.length - 1 - i];
        }
        return reversedDigits;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to check if the number is a palindrome
    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversedDigits = reverseDigits(digits);
        return areArraysEqual(digits, reversedDigits);
    }

    // Method to check if the number is a duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        for (int digit : digits) {
            if (digit != 0) {
                return true;  // If there is any non-zero digit, it is a Duck number
            }
        }
        return false;  // If all digits are zero, it is not a Duck number
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Storing the digits of the number in an array
        int[] digits = storeDigits(number);

        // Counting the number of digits
        int digitCount = countDigits(number);
        System.out.println("Number of digits in " + number + ": " + digitCount);

        // Checking if the number is a palindrome
        if (isPalindrome(number)) {
            System.out.println(number + " is a Palindrome.");
        } else {
            System.out.println(number + " is not a Palindrome.");
        }

        // Checking if the number is a Duck number
        if (isDuckNumber(number)) {
            System.out.println(number + " is a Duck number.");
        } else {
            System.out.println(number + " is not a Duck number.");
        }

        // Reversing the digits array and printing it
        int[] reversedDigits = reverseDigits(digits);
        System.out.print("Reversed digits of the number: ");
        for (int i = 0; i < reversedDigits.length; i++) {
            System.out.print(reversedDigits[i]);
        }
        System.out.println();
    }
}