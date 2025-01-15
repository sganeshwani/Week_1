import java.util.*;

class EqualString {
	// Boolean method to check if two strings are equal or not
	public static boolean compareTwoStrings (String string1, String string2) {
		if(string1.length() != string2.length()) {
			return false;
		} else {
			for(int i=0; i<string1.length(); i++) {
				if(string1.charAt(i)!=string2.charAt(i)) {
					return false;
				}
			}
		}
		return true;
	}
	
	// Main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Take string1 and string2 as input from the user
		System.out.print("Enter first string: ");
		String string1 = input.nextLine();
		System.out.print("Enter second string: ");
		String string2 = input.nextLine();
		
		//Call the compareTwoStrings method to check if the two strings are equal
		if(compareTwoStrings(string1,string2)) {
			System.out.println("The two strings are equal (custom method).");
		} else {
			System.out.println("The two strings are not equal (custom method).");
		}
		
		//Using built-in equals method to check if the two strings are equal
		if(string1.equals(string2)) {
			System.out.println("The two strings are equal (built-in method).");
		} else {
			System.out.println("The two strings are not equal (built-in method).");
		}
	}
}	