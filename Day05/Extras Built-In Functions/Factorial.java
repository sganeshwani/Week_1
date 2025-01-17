//Program to find factorial of a number
import java.util.*;

public class Factorial {

    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * calculateFactorial(n - 1); // recursion
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial:");
        int num = scanner.nextInt();

        System.out.println("The factorial of " + num + " is: " + calculateFactorial(num));

    }


}
