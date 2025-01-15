import java.util.*;

class SubstringComparison {
	
	// Method to create a substring using the charAt() method
    public static String createSubstring(String text, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i=start; i<end; i++) {
            substring.append(text.charAt(i));
        }
        return substring.toString();
    }

    // Method to compare two strings using the charAt() method
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String text = input.next();

        // Taking input for start and end indexes
        System.out.print("Enter the start index: ");
        int start = input.nextInt();
        System.out.print("Enter the end index: ");
        int end = input.nextInt();

        // Creating substring using the charAt() method
        String customSubstring = createSubstring(text, start, end);

        // Creating substring using the built-in substring() method
        String builtInSubstring = text.substring(start, end);

        // Comparing the two substrings
        boolean areEqual = compareStrings(customSubstring, builtInSubstring);

        System.out.println("Substring using charAt(): " + customSubstring);
        System.out.println("Substring using built-in method: " + builtInSubstring);

        if (areEqual) {
            System.out.println("The substrings are equal.");
        } else {
            System.out.println("The substrings are not equal.");
        }
    }
}