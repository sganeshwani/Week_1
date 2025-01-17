//Program to create a number guessing game
import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //initialize low with one and high with hundred
        int low = 1, high = 100;
        boolean guessedNumber = false;

        System.out.println("Think of a number between 1 and 100, and I'll try to guess it.");

        while (!guessedNumber) {
            int guess = (low + high) / 2; // Generate guess
            System.out.println("Is your number " + guess + "? (Enter 'high', 'low', or 'correct')");

            //Take feedback from user
            String feedback = scanner.next();

            //check for number
            if (feedback.equalsIgnoreCase("low")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("high")) {
                low = guess + 1;
            } else if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Hooray! I guessed your number.");
                guessedNumber = true;
            } else {
                System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
            }
        }
        
    }
}
