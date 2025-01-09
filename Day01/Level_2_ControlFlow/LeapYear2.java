import java.util.*;
public class LeapYear2{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		// Taking year as input
    	System.out.print("Enter a year greater than or equal to 1582: ");
    	int year = input.nextInt();
		// Now check whether it is a leap year or not 
		if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
    	    System.out.println(year + " is a Leap Year).");
    	    }
		else if(year >= 1582) {
    	    System.out.println(year + " is not a Leap Year.");
    	}
		else{
    	    System.out.println("The year must be greater than or equal to 1582 to be checked as per the Gregorian calendar.");
    	}		
	}
}	