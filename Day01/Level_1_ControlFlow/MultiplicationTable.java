import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input: Number for which multiplication table is needed
        System.out.print("Enter a number to display its multiplication table: ");
        int number = input.nextInt();

        // Generate and display multiplication table from 6 to 9
        System.out.println("Multiplication Table for " + number + ":");
		
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
