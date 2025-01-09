import java.util.Scanner;

public class KmToMileConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter distance in kilometers
        System.out.print("Enter the distance in kilometers: ");
        double km = input.nextDouble();

        // Convert kilometers to miles
        double miles = km * 0.6;
        System.out.println("The total miles is " + miles + " miles for the given " + km + " km");
    }
}
