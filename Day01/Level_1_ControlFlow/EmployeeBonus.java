import java.util.*;

public class EmployeeBonus {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input: Salary and years of service
        System.out.print("Enter the salary of the employee: ");
        double salary = input.nextDouble();

        System.out.print("Enter the years of service: ");
        int yearsOfService = input.nextInt();

        // Calculate bonus if years of service is more than 5
        double bonus = 0;
        if (yearsOfService > 5) {
            bonus = salary * 0.05; // 5% bonus
        }

        // Output the bonus
        System.out.println("The bonus amount is: INR " + bonus);
    }
}
