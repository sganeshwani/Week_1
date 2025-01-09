import java.util.*;

class MultiplesBelowHundred{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("The multiples of " + number + " below 100 are:");

        // Loop backward from 100 to 1
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) { // Check if i is a multiple of the number
                System.out.print(i + " "); // Print the multiple
            }
        }
    }
}
