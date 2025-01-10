import java.util.*;

class BMICalculator{
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input the number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = input.nextInt();

        // Create arrays to store height, weight, BMI, and status
        double[] heights = new double[numPersons];
        double[] weights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] statuses = new String[numPersons];

        // Input height and weight for each person
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Height in meters: ");
            heights[i] = input.nextDouble();
            System.out.print("Weight in kg: ");
            weights[i] = input.nextDouble();

            // Validate positive height and weight
            if (heights[i] <= 0 || weights[i] <= 0) {
                System.out.println("Invalid height or weight. Please re-enter.");
                i--; // Decrement the index to re-enter values
                continue;
            }

            // Calculate BMI
            bmis[i] = Math.round((weights[i] / (heights[i] * heights[i])) * 100.0) / 100.0;


            // Determine weight status
            if (bmis[i] <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmis[i]>=18.5 && bmis[i] <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmis[i]>= 25.0 && bmis[i] <= 39.99) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        // Display the results
        System.out.println("Height(m)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < numPersons; i++) {
            System.out.println(
                heights[i] + "\t\t" +
                weights[i] + "\t\t" +
                bmis[i] + "\t\t" +
                statuses[i]
            );
        }
    }
}
