import java.util.*;

public class AnagramCheck {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Check if lengths are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create arrays to store character frequencies
        int[] frequency1 = new int[26]; // For text1
        int[] frequency2 = new int[26]; // For text2

        // Calculate character frequencies
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i) - 'a']++; // Increment frequency for text1
            frequency2[text2.charAt(i) - 'a']++; // Increment frequency for text2
        }

        // Compare frequencies
        for (int i = 0; i < 26; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.println("Enter the first text:");
        String text1 = input.nextLine().toLowerCase().replaceAll("[^a-z]", ""); // Clean input
        System.out.println("Enter the second text:");
        String text2 = input.nextLine().toLowerCase().replaceAll("[^a-z]", ""); // Clean input

        // Check if texts are anagrams
        boolean result = areAnagrams(text1, text2);

        // Display result
        if (result) {
            System.out.println("The two texts are anagrams.");
        } else {
            System.out.println("The two texts are not anagrams.");
        }
    }
}
