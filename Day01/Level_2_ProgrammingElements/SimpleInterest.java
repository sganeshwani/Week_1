import java.util.*;
public class SimpleInterest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Taking inputs for Principal, Rate, and Time
        System.out.print("Enter the Principal amount: ");
        int principal = input.nextInt();
       
        System.out.print("Enter the Rate of interest: ");
        double rate = input.nextInt();
  
        System.out.print("Enter the Time period in years : ");
        int time = input.nextInt();

        // Calculating Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Displaying the result
        System.out.println("The Simple Interest is INR " + simpleInterest + " for Principal of " + 	principal + ", at rate of Interest " + rate + "%" + " and Time of " + time + " year.");
    }
}
