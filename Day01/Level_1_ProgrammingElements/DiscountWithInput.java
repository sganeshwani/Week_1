import java.util.*;
public class DiscountWithInput{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the fee amount INR: ");
        double fee = input.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();
	
	    //Calculate discount amount
        double discountAmount = (fee * discountPercent) / 100;
        //Calculate discount amount
	    double discountedFee = fee - discountAmount;

        System.out.println("The discount amount is INR "+ discountAmount + " and final discounted fee is INR " + discountedFee);
    }
}