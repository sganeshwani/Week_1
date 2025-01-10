import java.util.*;

class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get weight (in kg) and height (in cm) from the user
        System.out.print("Enter your weight in kg: ");
        double weight = input.nextDouble();
        
        System.out.print("Enter your height in cm: ");
        double heightCm = input.nextDouble();

        // Convert height from cm to meters
        double heightM = heightCm / 100;

        // Calculate BMI using the formula
        double bmi = weight / (heightM * heightM);

        // Display BMI value
        System.out.println("Your BMI is: " + bmi);

        // Determine the weight status based on BMI value
        if (bmi <= 18.4) {
            System.out.println("Status: Underweight");
        } else if (bmi >= 18.4 && bmi <= 24.9) {
            System.out.println("Status: Normal");
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("Status: Overweight");
        } else {
            System.out.println("Status: Obese");
        }
    }
}