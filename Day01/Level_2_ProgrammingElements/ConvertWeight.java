import java.util.*;

public class ConvertWeight{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight in pounds: ");
        int weightInPounds = input.nextInt();

        // Converting to kilograms
        double weightInKg = weightInPounds / 2.2;

        // Displaying the results
        System.out.println("The weight of the person in pounds is " + weightInPounds + " and in kilograms is " + weightInKg);
    }
}
