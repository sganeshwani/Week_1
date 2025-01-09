import java.util.*;

public class TemperatureConversion {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input: Celsius temperature
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Output the result
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit.");
    }
}
