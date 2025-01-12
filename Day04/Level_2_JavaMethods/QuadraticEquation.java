import java.util.*;

public class QuadraticEquation {
	public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c; //Calculating delta
        double[] roots = new double[0]; //Initialize an empty array for roots

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);  //First root
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);  //Second root
            roots = new double[]{root1, root2};
        } else if (delta == 0) {
            double root = -b / (2 * a); //One real root exists
            roots = new double[]{root}; //Single root
        } 
		return roots; //If delta < 0, no real roots, return empty array
    }
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        double a = input.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = input.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = input.nextDouble();

        // Ensure that a is not zero, because it would not be a quadratic equation
        if (a == 0) {
            System.out.println("Coefficient 'a' cannot be zero. This is not a quadratic equation.");
        } else {
            double[] roots = findRoots(a, b, c); //Find the roots of the quadratic equation

            if (roots.length == 0) {
                System.out.println("The equation has no real roots.");
            } else if (roots.length == 1) {
                System.out.println("The equation has one real root: " + roots[0]);
            } else {
                System.out.println("The equation has two real roots: " + roots[0] + " and " + roots[1]);
            }
        }
    }
}