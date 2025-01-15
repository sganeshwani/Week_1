import java.util.*;

public class PalindromeCheck {

    // Logic 1: Iterative method to check palindrome
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method to check palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Using character arrays
    public static boolean isPalindromeUsingArrays(String text) {
        // Reverse the text
        char[] original = text.toCharArray();
        char[] reversed = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }

        // Compare original and reversed arrays
        for (int i = 0; i < text.length(); i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a text to check if it is a palindrome:");
        String text = input.nextLine().toLowerCase().replaceAll("[^a-z0-9]", ""); // Clean input

        // Check palindrome using Logic 1
        boolean resultIterative = isPalindromeIterative(text);
        System.out.println("Using Iterative Logic: " + (resultIterative ? "Palindrome" : "Not a Palindrome"));

        // Check palindrome using Logic 2
        boolean resultRecursive = isPalindromeRecursive(text, 0, text.length() - 1);
        System.out.println("Using Recursive Logic: " + (resultRecursive ? "Palindrome" : "Not a Palindrome"));

        // Check palindrome using Logic 3
        boolean resultArrays = isPalindromeUsingArrays(text);
        System.out.println("Using Character Arrays: " + (resultArrays ? "Palindrome" : "Not a Palindrome"));
    }
}
