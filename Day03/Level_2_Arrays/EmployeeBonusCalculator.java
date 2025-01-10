import java.util.Scanner;

class EmployeeBonusCalculator {

    public static void main(String[] args) {
        int EMPLOYEE_COUNT = 10; // Number of employees
        double BONUS_RATE_MORE_THAN_5_YEARS = 0.05; // 5% bonus
        double BONUS_RATE_LESS_THAN_5_YEARS = 0.02; // 2% bonus

        double[] salaries = new double[EMPLOYEE_COUNT];
        double[] yearsOfService = new double[EMPLOYEE_COUNT];
        double[] bonuses = new double[EMPLOYEE_COUNT];
        double[] newSalaries = new double[EMPLOYEE_COUNT];

        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

		//Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Input data for each employee
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            // Input salary with validation
            double salary;
            do {
                System.out.print("Enter salary positive value: ");
                salary = input.nextDouble();
                if (salary <= 0) {
                    System.out.println("Invalid salary. Please enter a positive value.");
                }
            } while (salary <= 0);

            // Input years of service with validation
            double years;
            do {
                System.out.print("Enter years of service non-negative value: ");
                years = input.nextDouble();
                if (years < 0) {
                    System.out.println("Invalid years of service. Please enter a non-negative value.");
                }
            } while (years < 0);

            // Store data
            salaries[i] = salary;
            yearsOfService[i] = years;
        }

        // Calculate bonus, new salary, and totals
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            double bonusRate = (yearsOfService[i] > 5) ? BONUS_RATE_MORE_THAN_5_YEARS : BONUS_RATE_LESS_THAN_5_YEARS;
            bonuses[i] = salaries[i] * bonusRate;
            newSalaries[i] = salaries[i] + bonuses[i];

            totalOldSalary += salaries[i];
            totalBonus += bonuses[i];
            totalNewSalary += newSalaries[i];
        }

        // Output results
        System.out.println("\n=== Employee Bonus Details ===");
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salaries[i] +
                               ", Bonus = " + bonuses[i] + ", New Salary = " + newSalaries[i]);
        }

        System.out.println("\n=== Total Details ===");
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

    }
}
