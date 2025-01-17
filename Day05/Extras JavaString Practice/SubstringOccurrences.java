import java.util.*;

public class SubstringOccurrences {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        System.out.print("Enter the substring: ");
        String subString = scanner.nextLine();
        
        int count = 0;
        int index = 0;
        
        // Loop to find each occurrence of the substring
        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++; // Increment the count for each occurrence
            index++; // Move the index forward to search for the next occurrence
        }
        
        // Output the number of times the substring occurs
        System.out.println("Substring occurrences: " + count);
    }
}
