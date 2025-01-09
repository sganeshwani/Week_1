import java.util.*;

public class TemperatureConversion2 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input: Fahrenheit temperature
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Output the result
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius.");
    }
}
