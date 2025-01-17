// Program for conveting Celsius to Fahrenheit and vice-versa
import java.util.*;

public class TemperatureConverter {

    //Method for converting celsius to fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    //Method for converting fahrenheit to celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 to convert Celsius to Fahrenheit, or 2 for Fahrenheit to Celsius:");
        int choice = scanner.nextInt();

        System.out.println("Enter the temperature:");
        double temp = scanner.nextDouble();

        if (choice == 1) {
            System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(temp));
        } else if (choice == 2) {
            System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(temp));
        } else {
            System.out.println("Invalid choice.");
        }

    }

}
