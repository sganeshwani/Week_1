import java.util.*;

public class GreatestFactor{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get an integer input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize the greatestFactor variable
        int greatestFactor = 1;

        // Loop to find the greatest factor
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break; // Exit the loop after finding the greatest factor
            }
        }

        // Display the greatest factor
        System.out.println("The greatest factor of " + number + ", besides itself is: " + greatestFactor);
    }
}
