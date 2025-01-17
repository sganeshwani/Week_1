import java.util.*;

public class RemoveSpecificCharacter {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter character to remove: ");
        char charToRemove = scanner.next().charAt(0);
        
        // Use replaceAll to remove all occurrences of the character
        String modifiedString = input.replaceAll(String.valueOf(charToRemove), "");
        
        // Output the modified string
        System.out.println("Modified string: " + modifiedString);
    }
}
