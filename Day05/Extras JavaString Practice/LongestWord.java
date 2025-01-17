import java.util.*;

public class LongestWord {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        
        // Split the sentence into words using space as a delimiter
        String[] words = input.split(" ");
        
        // Assume the first word is the longest
        String longestWord = words[0];
        
        // Loop through all words in the sentence
        for (String word : words) {
            // Compare lengths of words to find the longest one
            if (word.length() > longestWord.length()) {
                longestWord = word; // Update longestWord if a longer word is found
            }
        }
        
        // Output the longest word
        System.out.println("The longest word is: " + longestWord);
    }
}
