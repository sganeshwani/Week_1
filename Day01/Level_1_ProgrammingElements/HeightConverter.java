import java.util.*;
public class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        // Convert height to inches
        double heightInInches = heightCm / 2.54;

        // Convert inches to feet and remaining inches
        int heightInFeet = (int) (heightInInches / 12); // Integer part is feet
        double remainingInches = heightInInches % 12;  // Remainder is inches

        System.out.println(
            "Your Height in cm is " + heightCm + 
            " while in feet is " + heightInFeet + 
            " and inches is " + remainingInches
        );
    }
}
