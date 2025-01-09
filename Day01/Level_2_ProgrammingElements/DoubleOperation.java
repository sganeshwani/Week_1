import java.util.*;

public class DoubleOperation {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input: values for a, b, and c as double
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();

        // Perform operations
        double result1 = a + b * c;      // Multiplication (*) has higher precedence than addition (+)
        double result2 = a * b + c;      // Multiplication (*) has higher precedence than addition (+)
        double result3 = c + a / b;      // Division (/) has higher precedence than addition (+)
        double result4 = a % b + c;      // Modulus (%) has higher precedence than addition (+)

        // Output the results
        System.out.println("The results of Double Operations are: "+result1+" , "+result2+" , "+result3+" , "+result4);
    }
}
