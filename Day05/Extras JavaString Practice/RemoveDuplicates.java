import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Create a StringBuilder to store the result without duplicates
        StringBuilder result = new StringBuilder();
        
        // Loop through each character of the input string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            // If the character is not already in the result, append it
            if (result.toString().indexOf(c) == -1) {
                result.append(c);
            }
        }
        
        // Output the string with duplicates removed
        System.out.println("String without duplicates: " + result);
    }
}
