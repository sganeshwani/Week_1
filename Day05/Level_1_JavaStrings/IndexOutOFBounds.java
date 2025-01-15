import java.util.*;

public class IndexOutOFBounds {
	
	//Method to generate exception for StringIndexOutOfBoundsException
	public static void generateException (String text) {
		System.out.println("Attempting to generate a StringIndexOutOfBoundsException... ");
		System.out.println("character at index 50: "+text.charAt(50));		
	}
	
	//Method to handle exception StringIndexOutOfBoundsException with try and catch block
	public static void handleException (String text) {
		System.out.println("Handling StringIndexOutOfBoundsException using a try-catch block...");
		try {
			System.out.println("character at index 50: "+text.charAt(50));
		} catch (StringIndexOutOfBoundsException e){
			System.out.println("Exception caught " + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Take the string as input from user
		System.out.print("Enter the string: ");
		String string = input.next();
		
		try {
			//Call the method to generate exception for user input string
			generateException(string);
		} catch (StringIndexOutOfBoundsException e){
			System.out.println("Exception caught and handled in main " + e.getMessage());
		}
		//Call the method to handle exception 
		handleException(string);
	}
}