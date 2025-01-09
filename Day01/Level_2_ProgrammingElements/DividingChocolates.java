import java.util.*;
public class DividingChocolates{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();
        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();
        // Calculating chocolates per child and remaining chocolates
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Displaying the results
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " 	and the number of remaining chocolates are " + remainingChocolates);
    }
}
