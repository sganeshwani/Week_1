import java.util.*;

public class VowelConsonantCount {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = input.nextLine().toLowerCase(); // Convert input to lowercase to handle case-insensitivity
        
        int vowels = 0, consonants = 0;

        // Loop through each character of the input string
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) { // Check if the character is a letter (ignoring numbers and symbols)
                if ("aeiou".indexOf(c) != -1) { // Check if the character is a vowel
                    vowels++;
                } else { // If it's not a vowel, it's a consonant
                    consonants++;
                }
            }
        }
        
        // Output the count of vowels and consonants
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
