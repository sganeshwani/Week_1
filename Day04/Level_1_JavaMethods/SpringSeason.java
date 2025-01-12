import java.util.*;
public class SpringSeason{
	//Method to check for spring season
	public static boolean springSeason(int month,int day){
		
		boolean springSea;
		//Applying conditions for checking whether it is a spring season or not 
		if((month == 3) && (day >=20 && day <= 31)){
			springSea = true;
		}
		else if((month == 4) && (day>=1 && day<=30)) {
			springSea = true;
		}
		else if((month == 5) && (day>=1 && day<=31)) {
			springSea = true;
		}
		else if((month == 6) && (day>=1 && day<=20)) {
			springSea = true;
		}
		else springSea = false;
		return springSea;
	}
	
	//Main method
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Month: ");
		int month = input.nextInt();
		
		System.out.print("Enter the Day: ");
		int day = input.nextInt();
		
		//Calling method
		if(springSeason(month,day)) {
			System.out.println("It's a Spring season");
		}else {
			System.out.println("Not a Spring season");
		}
	}
}