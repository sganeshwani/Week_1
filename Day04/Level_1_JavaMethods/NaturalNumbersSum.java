import java.util.*;
public class NaturalNumbersSum{
    //function to calculate sum of n natural numbers
    public static int sum(int number){
        int sum=0;
        for(int i=1;i<=number;i++){
            sum+=i;
        }
        return sum;
    }
    //main function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//take input number from user
        System.out.print("Enter natural number for its sum: ");
        int number = input.nextInt();
        int sum = sum(number);
        
        //printing the sum 
        System.out.println("Sum of "+number+" natural numbers is "+sum);
    }
}