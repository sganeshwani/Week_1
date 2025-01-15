import java.util.*;

public class TrimString {

    public static int[] trimSpaces(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Find the first non-space character
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Find the last non-space character
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String substringFromString(String str, int start, int end) {
        return str.substring(start, end + 1);
    }

    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = scanner.nextLine();

        // Trimming using charAt
        int[] trimIndices = trimSpaces(input);
        String trimmedString = substringFromString(input, trimIndices[0], trimIndices[1]);

        // Using built-in trim() method
        String trimmedStringBuiltIn = input.trim();

        // Compare both methods
        boolean isEqual = compareStrings(trimmedString, trimmedStringBuiltIn);

        System.out.println("Trimmed String using charAt: '" + trimmedString + "'");
        System.out.println("Trimmed String using trim(): '" + trimmedStringBuiltIn + "'");
        System.out.println("Are both strings equal? " + isEqual);
    }
}
