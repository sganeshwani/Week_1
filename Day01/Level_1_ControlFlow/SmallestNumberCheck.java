import java.util.*;

public class SmallestNumberCheck {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input: Get the three numbers from the user
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();

        // Check if the first number is the smallest
        boolean isSmallest = (number1 < number2) && (number1 < number3);

        // Output the result
        System.out.println("Is the first number the smallest? " + (isSmallest ? "Yes" : "No"));
    }
}
