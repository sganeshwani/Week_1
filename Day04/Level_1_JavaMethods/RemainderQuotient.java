import java.util.*;

public class RemainderQuotient {
	//Method to find the remainder and the quotient of a number
	public static int[] findRemainderAndQuotient(int number, int divisor) {
		int remainder = number / divisor;
		int quotient = number % divisor;
		
		// Returning an array with quotient and remainder
		return new int[]{remainder,quotient};
	}
	
	//Main class
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the dividend: ");
		int number = input.nextInt();
		System.out.print("Enter the divisor: ");
		int divisor = input.nextInt();
		
		//Calling the method to find remainder and quotient
		int result[] = findRemainderAndQuotient(number,divisor);
		
		System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
	}
}