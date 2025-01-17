import java.util.*;

public class PalindromeCheck {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = input.nextLine();
        
        // Reverse the string using StringBuilder
        String reversed = new StringBuilder(input).reverse().toString();
        
        // Check if the original string is equal to the reversed string
        if (input.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
