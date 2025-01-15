import java.util.*;

public class BMICalculator {

	//method for calculating BMI
    public static String[][] computeBMI(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInCm = data[i][1];
            double heightInMeters = heightInCm / 100.0;
            double bmi = weight / (heightInMeters * heightInMeters);
			
			//create a string variable for status
            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            result[i][0] = String.valueOf(weight);
            result[i][1] = String.valueOf(heightInCm);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

	//method for displaying the result
    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (String[] row : results) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }

	//main method
    public static void main(String[] args) {
		
		//Create scanner object for input
        Scanner input = new Scanner(System.in);
        double[][] data = new double[10][2];

        System.out.println("Please Enter weight in kg and height in cm for 10 persons:");
		
		
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " - Weight kg: ");
            data[i][0] = input.nextDouble();
            System.out.print("Person " + (i + 1) + " - Height cm: ");
            data[i][1] = input.nextDouble();
        }

        String[][] results = computeBMI(data);
        displayResults(results);
    }
}
