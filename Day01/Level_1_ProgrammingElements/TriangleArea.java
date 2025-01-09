import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle (in inches): ");
        double baseInches = scanner.nextDouble();
        System.out.print("Enter the height of the triangle (in inches): ");
        double heightInches = scanner.nextDouble();

        // Calculate the area of the triangle in square inches
        double areaInInches = 0.5 * baseInches * heightInches;

        // Convert the area to square centimeters (1 inch = 2.54 cm, so 1 inch^2 = 6.4516 cm^2)
        double areaInCm2 = areaInInches * 6.4516;

        System.out.println(
            "The area of the triangle is " + areaInInches + " square inches " +
            "and " + areaInCm2 + " square centimeters."
        );
    }
}
