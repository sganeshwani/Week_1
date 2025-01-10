import java.util.*;

class BMICalculator2{
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input the number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = input.nextInt();

        // Create a 2D array to store height, weight, and BMI
        double[][] personData = new double[numPersons][3];
        String[] weightStatus = new String[numPersons];

        // Input height and weight for each person
        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nEnter details for person " + (i + 1) + ":");

            // Input height
            System.out.print("Height in meters: ");
            personData[i][0] = input.nextDouble();
            while (personData[i][0] <= 0) {
                System.out.println("Invalid height. Please enter a positive value.");
                System.out.print("Height in meters: ");
                personData[i][0] = input.nextDouble();
            }

            // Input weight
            System.out.print("Weight in kg: ");
            personData[i][1] = input.nextDouble();
            while (personData[i][1] <= 0) {
                System.out.println("Invalid weight. Please enter a positive value.");
                System.out.print("Weight in kg: ");
                personData[i][1] = input.nextDouble();
            }

            // Calculate BMI and store it in the array
            personData[i][2] = Math.round((personData[i][1] / (personData[i][0] * personData[i][0])) * 100.0) / 100.0;

            // Determine weight status
            if (personData[i][2] <= 18.40) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2]>= 18.5 && personData[i][2] <= 24.99) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2]>=25.5 && personData[i][2] <= 39.99) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the results
        System.out.println("\nHeight (m)\tWeight (kg)\tBMI\t\tStatus");
        for (int i = 0; i < numPersons; i++) {
            System.out.println(
                personData[i][0] + "\t\t" +
                personData[i][1] + "\t\t" +
                personData[i][2] + "\t\t" +
                weightStatus[i]
            );
        }
    }
}

