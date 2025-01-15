import java.util.*;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string
    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();  // Convert the string to a char array
        int[] freq = new int[chars.length]; // Array to store frequencies

        // Outer loop to initialize and count frequencies
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') { // Skip already counted characters
                freq[i] = 1; // Initialize frequency
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        freq[i]++;
                        chars[j] = '0'; // Mark duplicate characters as '0'
                    }
                }
            }
        }

        // Create a 1D array to store characters and their frequencies
        String[] result = new String[chars.length];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') { // Ignore marked characters
                result[index++] = chars[i] + ": " + freq[i];
            }
        }
        return result; // Return the result array
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string to find the frequency of characters:");
        String text = input.nextLine();

        // Call the method and get the result
        String[] frequency = findFrequency(text);

        // Display the result
        System.out.println("Character frequencies:");
        for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] != null) { // Skip null values
				System.out.println(frequency[i]);
			}
		}
    }
}
