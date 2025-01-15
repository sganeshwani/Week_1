import java.util.*;

public class TextToLowerCase {

    // Method to convert text to lowercase using charAt() and ASCII values
    public static String convertToLowerCase(String text) {
        StringBuilder lowerCaseText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                lowerCaseText.append((char) (ch + 32)); // Convert to lowercase
            } else {
                lowerCaseText.append(ch); // Keep other characters unchanged
            }
        }
        return lowerCaseText.toString();
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

        // Convert text to lowercase using String's built-in method
        String builtInLowerCase = userInput.toLowerCase();

        // Convert text to lowercase using custom method
        String customLowerCase = convertToLowerCase(userInput);

        // Compare the two results
        boolean areEqual = compareStrings(builtInLowerCase, customLowerCase);

        // Display the results
        System.out.println("\nBuilt-in toLowerCase result: " + builtInLowerCase);
        System.out.println("Custom conversion result: " + customLowerCase);
        System.out.println("Are both results equal? " + areEqual);
    }
}
