import java.util.*;

public class SimpleInterest{
	//function of return type double to calculate Simple Interest
	public static double SI(double principle, double rate, double time){
		//formula to calculate simple interest
		double simpleInterest = (principle * rate * time) / 100;
 
		return simpleInterest;
	}
	
	//main method
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Principle: ");
		// input principle by user
		double principle = input.nextDouble();
		System.out.print("Enter rate of interest: ");
		//input rate of interest by user
		double rate = input.nextDouble();
		System.out.print("Enter Time: ");
		//input time by user
		double time = input.nextDouble();
		
		//function called to calculate the simple interest
		double simpleInterest = SI(principle, rate, time);
		
		System.out.println("The Simple Interest is " +simpleInterest+ " for Principal "+principle+" Rate of Interest "+rate+" and Time " +time);
	}
}