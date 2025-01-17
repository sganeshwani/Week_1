import java.util.*;

public class ToggleCase {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // StringBuilder to store the modified string with toggled case
        StringBuilder toggled = new StringBuilder();
        
        // Loop through each character of the input string
        for (char c : input.toCharArray()) {
            // Check if the character is uppercase and convert to lowercase
            if (Character.isUpperCase(c)) {
                toggled.append(Character.toLowerCase(c));
            } else { // Convert lowercase characters to uppercase
                toggled.append(Character.toUpperCase(c));
            }
        }
        
        // Output the string with toggled case
        System.out.println("Toggled string: " + toggled);
    }
}
