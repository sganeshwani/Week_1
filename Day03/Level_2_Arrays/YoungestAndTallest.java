import java.util.Scanner;

class YoungestAndTallest {

    public static void main(String[] args) {
        final int friendCount = 3; // Number of friends
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[friendCount];
        double[] heights = new double[friendCount];

		//Create Scanner object
        Scanner input = new Scanner(System.in);

        // Input age and height for each friend
        for (int i = 0; i < friendCount; i++) {
            System.out.println("Enter details for " + friends[i]);

            // Input age 
            System.out.print("Enter age: ");
            int age = input.nextInt();
            while (age <= 0) {
                System.out.println("Invalid age. Please enter a positive value.");
                System.out.print("Enter age, a positive value: ");
                age = input.nextInt();
            }
            ages[i] = age;

            // Input height 
            System.out.print("Enter height in cm: ");
            double height = input.nextDouble();
            while (height <= 0) {
                System.out.println("Invalid height. Please enter a positive value.");
                System.out.print("Enter height in cm, a positive value: ");
                height = input.nextDouble();
            }
            heights[i] = height;
        }

        // Find the youngest friend
        int youngestIndex = 0;
        for (int i = 1; i < friendCount; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Find the tallest friend
        int tallestIndex = 0;
        for (int i = 1; i < friendCount; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display the results
        System.out.println("\nThe youngest friend is " + friends[youngestIndex] + " with age " + ages[youngestIndex]);
        System.out.println("The tallest friend is " + friends[tallestIndex] + " with height " + heights[tallestIndex] + " cm");

        input.close();
    }
}
