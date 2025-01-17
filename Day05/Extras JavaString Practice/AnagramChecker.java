import java.util.*;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Accept two strings from the user
        System.out.print("Enter the first string: ");
        String string1 = input.nextLine();

        System.out.print("Enter the second string: ");
        String string2 = input.nextLine();

        // Check if the two strings are anagrams
        if (areAnagrams(string1, string2)) {
            System.out.println("The two strings are anagrams of each other.");
        } else {
            System.out.println("The two strings are not anagrams of each other.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert strings to lowercase for a case-insensitive comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If the lengths are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Compare the sorted arrays
        return Arrays.equals(array1, array2);
    }
}
