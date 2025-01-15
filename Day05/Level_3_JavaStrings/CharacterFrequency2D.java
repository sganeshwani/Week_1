import java.util.*;

public class CharacterFrequency2D {

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text) {
        int[] freq = new int[256]; // Array to store frequency using ASCII values

        // Calculate frequency of each character
        for (char c : text.toCharArray()) {
            freq[c]++;
        }

        // Get unique characters
        String uniqueChars = uniqueCharacters(text);

        // Create a 2D array to store unique characters and their frequencies
        String[][] result = new String[uniqueChars.length()][2];
        for (int i = 0; i < uniqueChars.length(); i++) {
            char c = uniqueChars.charAt(i);
            result[i][0] = String.valueOf(c); // Store the character
            result[i][1] = String.valueOf(freq[c]); // Store its frequency
        }

        return result;
    }

    // Method to find unique characters in the string
    public static String uniqueCharacters(String text) {
        StringBuilder unique = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (unique.indexOf(String.valueOf(c)) == -1) { // Check if character is unique
                unique.append(c);
            }
        }
        return unique.toString();
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Call the method and get the result
        String[][] result = findCharacterFrequency(text);

        // Display the result
        System.out.println("Character Frequencies:");
        for (String[] pair : result) {
            System.out.println(pair[0] + ": " + pair[1]);
        }
    }
}
