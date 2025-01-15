import java.util.*;

public class IllegalArgumentException {
    // Method to generate the IllegalArgumentException
    public static void generateException(String input) {
        System.out.println("Generating exception...");
        System.out.println(input.substring(5, 2)); // Will throw IllegalArgumentException
    }

    // Method to handle the exception
    public static void handleException(String input) {
        try {
            System.out.println("Handling exception...");
            System.out.println(input.substring(5, 2));
        } catch (Exception e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		// Take the string as input from user
        System.out.println("Enter a string:");
        String userInput = input.nextLine();

        try {
            generateException(userInput);
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
		// Call the method to handle exception
        handleException(userInput);
    }
}
