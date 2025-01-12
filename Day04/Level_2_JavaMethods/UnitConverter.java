import java.util.*;
public class UnitConverter {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Test temperature conversions
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();
        System.out.println(fahrenheit + " Fahrenheit is equal to " + convertFahrenheitToCelsius(fahrenheit) + " Celsius");
        System.out.println(celsius + " Celsius is equal to " + convertCelsiusToFahrenheit(celsius) + " Fahrenheit");
		System.out.println();
		
        // Test weight conversions
        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();
        System.out.print("Enter weight in kilograms: ");
        double kilograms = input.nextDouble();
        System.out.println(pounds + " pounds is equal to " + convertPoundsToKilograms(pounds) + " kilograms");
        System.out.println(kilograms + " kilograms is equal to " + convertKilogramsToPounds(kilograms) + " pounds");
		System.out.println();
		
        // Test volume conversions
        System.out.print("Enter volume in gallons: ");
        double gallons = input.nextDouble();
        System.out.print("Enter volume in liters: ");
        double liters = input.nextDouble();
        System.out.println(gallons + " gallons is equal to " + convertGallonsToLiters(gallons) + " liters");
        System.out.println(liters + " liters is equal to " + convertLitersToGallons(liters) + " gallons");
    }
}
