//Program to find maximum of three numbers
import java.util.*;

public class MaxOfThree {

    //Method to find maximum of three numbers
    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    //main
    public static void main(String[] args) {

        //Create Scanner object 
        Scanner scanner = new Scanner(System.in);

        //Take user input
        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        //Call out method
        int max = findMax(num1, num2, num3);
        System.out.println("The maximum number is: " + max);

    }
}
