import java.util.*;
public class LargestAndSmallest{
	public static int[] findSmallestAndLargest(int number1, int number2, int number3){
	
		//taken the array of size 2
		int[] array=new int[2];
		
		//assigned the minimum and maximum number in array at index 0&1
		array[0]=Math.min(number1,Math.min(number2,number3));
		array[1]=Math.max(number1,Math.max(number2,number3));
		return array;
	}
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		
		//Taking 3 numbers as input
		System.out.print("Enter number1: ");
		int number1=input.nextInt();
		System.out.print("Enter number2: ");
		int number2=input.nextInt();
		System.out.print("Enter number3: ");
		int number3=input.nextInt();
	
		//calling the method findSmallestAndLargest 
		int[] array=findSmallestAndLargest(number1,number2,number3);
	
		//printing the smallest and largest number
		System.out.println("Smallest Number: "+array[0]);
		System.out.println("Largest Number: "+array[1]);
	}
}