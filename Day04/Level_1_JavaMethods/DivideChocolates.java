import java.util.*;

public class DivideChocolates {
	public static int[] NoOfChocolatesToDistribute(int numberOfChocolates, int numberOfChildrens) {
		int remaining = numberOfChocolates / numberOfChildrens;
		int get = numberOfChocolates % numberOfChildrens;
		
		// Returning an array with remaining and chocolates get
		return new int[]{remaining,get};
	}
	
	//Main class
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the total number of Chocolates: ");
		int numberOfChocolates = input.nextInt();
		System.out.print("Enter the number of Childrens: ");
		int numberOfChildrens = input.nextInt();
		
		//Calling the method to find remaining and chocolates get
		int result[] = NoOfChocolatesToDistribute(numberOfChocolates,numberOfChildrens);
		
		System.out.println("Each children will get " + result[0] + " chocolates");
        System.out.println("Remaining chocolates: " + result[1]);
	}
}