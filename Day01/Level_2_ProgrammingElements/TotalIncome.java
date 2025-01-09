import java.util.*;

public class TotalIncome {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input: Salary
        System.out.print("Enter the salary (INR): ");
        double salary = input.nextDouble();

        // Input: Bonus
        System.out.print("Enter the bonus (INR): ");
        double bonus = input.nextDouble();

        // Compute total income
        double totalIncome = salary + bonus;

        // Output the results
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus 
                           + ". Hence Total Income is INR " + totalIncome + ".");
    }
}
