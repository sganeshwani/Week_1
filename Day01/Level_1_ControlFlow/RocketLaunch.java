import java.util.*;

public class RocketLaunch {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input: Get the starting countdown value from the user
        System.out.print("Enter countdown start value: ");
        int counter = input.nextInt();

        // Countdown loop: Continue until counter is greater than or equal to 1
        while (counter >= 1) {
            System.out.println("Countdown: " + counter);
            counter--;  // Decrement the counter by 1
        }

        // Print launch message after countdown is complete
        System.out.println("Launch!");
    }
}
