import java.util.*;

public class RocketLaunch2 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input: Get the starting countdown value from the user
        System.out.print("Enter countdown start value: ");
        int counter = input.nextInt();

        // Countdown loop using a for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println("Countdown: " + i);
        }

        // Print launch message after countdown is complete
        System.out.println("Launch!");
    }
}
