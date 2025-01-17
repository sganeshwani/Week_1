import java.util.*;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Create a HashMap to store character counts
        HashMap<Character, Integer> charCount = new HashMap<>();
        
        // Loop through each character in the string
        for (char c : input.toCharArray()) {
            // Update the count of each character in the map
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // Variables to keep track of the most frequent character
        char mostFrequentChar = '\0';
        int maxCount = 0;
        
        // Loop through the map to find the character with the highest frequency
        for (char c : charCount.keySet()) {
            if (charCount.get(c) > maxCount) {
                mostFrequentChar = c;
                maxCount = charCount.get(c);
            }
        }
        
        // Output the most frequent character
        System.out.println("Most Frequent Character: " + mostFrequentChar);
    }
}
