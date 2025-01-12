import java.util.*;
public class HandShakes2 {
	//method of return type int to calculate total handshakes
    public static double handShakes(int number){
		//formula to calculate total handshakes
        double handShakes = (double) (number * (number - 1))/2;
		
        return handShakes;
    }
	
	//main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter the number: ");
		//input number by user
        int number = sc.nextInt();
		//function called to calculate total number of possible handshakes
        double handShakes = handShakes(number);
		
        System.out.println("Number of possible handShakes = "+ handShakes);
    }
}