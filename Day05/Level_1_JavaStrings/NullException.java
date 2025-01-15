import java.util.*;

class NullException {
	
	public static void generateException() {
		String text = null;
		System.out.println(text.length());
    }
	
	public static void checkException(){
		String text =null;
		try{
			System.out.println(text.length());
		}
		catch(NullPointerException e){
			System.out.println("This is a null string, Kindly initialize it" + e.getMessage());
		}
	}
	public static void main (String args[]) {
	
		String text = null;
		try{
			System.out.println(text.length());
		}
		catch(NullPointerException e){
			System.out.println(" \nThis is a null string, Kindly initialize it" + e.getMessage());
		}
		catch(Exception e){
			System.out.println(" \n This is a null string, Kindly initialize it" + e.getMessage());
		}
		checkException();
	}
}