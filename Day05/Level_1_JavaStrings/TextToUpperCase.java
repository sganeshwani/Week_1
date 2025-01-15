import java.util.*;

public class TextToUpperCase {

    // Method to convert text to uppercase using charAt() and ASCII values
    public static String convertToUpperCase(String text) {
        StringBuilder upperCaseText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                upperCaseText.append((char) (ch - 32)); // Convert to uppercase
            } else {
                upperCaseText.append(ch); // Keep other characters unchanged
            }
        }
        return upperCaseText.toString();
    }

    // Method to compare two strings character by character using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // Strings are not equal if lengths differ
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // Characters differ at some index
            }
        }
        return true; // All characters are equal
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String userInput = input.nextLine();

        // Convert text to uppercase using String's built-in method
        String builtInUpperCase = userInput.toUpperCase();

        // Convert text to uppercase using custom method
        String customUpperCase = convertToUpperCase(userInput);

        // Compare the two results
        boolean areEqual = compareStrings(builtInUpperCase, customUpperCase);

        // Display the results
        System.out.println("\nBuilt-in toUpperCase result: " + builtInUpperCase);
        System.out.println("Custom conversion result: " + customUpperCase);
        System.out.println("Are both results equal? " + areEqual);
    }
}
