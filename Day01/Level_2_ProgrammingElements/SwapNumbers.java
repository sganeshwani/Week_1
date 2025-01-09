import java.util.*;

public class SwapNumbers{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// Taking user input for two numbers
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        // Swapping the numbers
        int temp = number1;
        number1 = number2;
        number2 = temp;
        // Displaying the swapped numbers
        System.out.println("The swapped numbers are " + number1 + " and " + number2);
    }
}
