import java.util.*;

public class CompareStrings {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String string1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String string2 = scanner.nextLine();
        
        // Compare the strings lexicographically (dictionary order)
        if (string1.equals(string2)) {
            System.out.println("The strings are equal.");
        } else if (string1.compareTo(string2) < 0) {
            // If string1 comes before string2 lexicographically
            System.out.println("\"" + string1 + "\" comes before \"" + string2 + "\" in lexicographical order.");
        } else {
            // If string1 comes after string2 lexicographically
            System.out.println("\"" + string1 + "\" comes after \"" + string2 + "\" in lexicographical order.");
        }
    }
}
