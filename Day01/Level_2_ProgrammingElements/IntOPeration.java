import java.util.*;

public class IntOperation {
    public static void main(String[] args) {
		// Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input: values for a, b, and c
        System.out.print("Enter the value of a: ");
        int a = input.nextInt();
        System.out.print("Enter the value of b: ");
        int b = input.nextInt();
        System.out.print("Enter the value of c: ");
        int c = input.nextInt();

        // Perform operations         
        int result1 = a + b * c;      // Multiplication (*) has higher precedence than addition (+)
        int result2 = a * b + c;      // Multiplication (*) has higher precedence than addition (+)
        int result3 = c + a / b;      // Division (/) has higher precedence than addition (+)
        int result4 = a % b + c;      // Modulus (%) has higher precedence than addition (+)

		// Output the results
        System.out.println("The results of Int Operations are: "+result1+" , "+result2+" , "+result3+" , "+result4);
    }
}
