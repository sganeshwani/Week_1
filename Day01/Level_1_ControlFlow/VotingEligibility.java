import java.util.*;

public class VotingEligibility {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input: Get the age of the person
        System.out.print("Enter the person's age: ");
        int age = input.nextInt();

        // Check if the person is 18 or older
        if (age >= 18) {
            // Output if the person can vote
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            // Output if the person cannot vote
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }
}
