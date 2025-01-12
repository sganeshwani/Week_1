import java.util.*;

public class WindChill {
	public static double calculateWindChill(double temperature, double windSpeed) {
		
		//Formula to calculate wind chill
		double windChill = 35.74 + 0.6215 * temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed,0.16);
		
		return windChill;
	}
	
	//Main class
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Taking temperature and wind speed as inputs
		System.out.print("Enter the temperature: ");
		double temperature = input.nextDouble();
		System.out.print("Enter the windSpeed: ");
		double windSpeed = input.nextDouble();
		
		//Calling the method to calculate wind chill
		double windChill = calculateWindChill(temperature, windSpeed);
		
		//Printing the wind chill temperature
		System.out.printf("The wind chill temperature is: %.2f fahrenheit\n", windChill);
	}
}