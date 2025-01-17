import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = input.nextLine();
        
        // Initialize an empty string to store the reversed string
        String reversed = "";
        
        // Loop through the input string in reverse order
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i); // Append each character to the reversed string
        }
        
        // Output the reversed string
        System.out.println("Reversed string: " + reversed);
    }
}
