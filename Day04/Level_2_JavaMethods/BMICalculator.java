import java.util.*;

public class BMICalculator {

    // Method to calculate BMI for each person and populate the 2D array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100; // Convert height from cm to meters
            data[i][2] = weight / (heightInMeters * heightInMeters); // Calculate BMI
        }
    }

    // Method to determine BMI status based on BMI value
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] data = new double[10][3]; // 2D array to store weight, height, and BMI

        // Take input for weight and height for 10 persons
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = input.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = input.nextDouble();
        }

        // Calculate BMI
        calculateBMI(data);

        // Determine BMI status
        String[] status = determineBMIStatus(data);

        // Display the result
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", data[i][0], data[i][1], data[i][2], status[i]);
        }
    }
}
