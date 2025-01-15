import java.util.*;

public class ArrayIndexOutOfBounds {

    // Method to generate the ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        try {
            // Access an index larger than the length of the array (deliberately out of bounds)
            System.out.println(names[10]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
            throw e; 
        }
    }

    // Method to handle a generic runtime exception
    public static void handleRuntimeException(String[] names) {
        try {
            // Call the method that generates the exception
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException in the main method: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Handled a generic exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Take user input to populate the array of names
        System.out.print("Enter the number of names: ");
        int numberOfNames = input.nextInt();
        scanner.nextLine(); 

        String[] names = new String[numberOfNames];
        for (int i = 0; i < numberOfNames; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = input.nextLine();
        }

        System.out.println("\nCalling method to generate the exception...");
        generateException(names);

        System.out.println("\nCalling method to handle the runtime exception...");
        handleRuntimeException(names);
    }
}
