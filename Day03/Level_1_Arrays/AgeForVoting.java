//Program to check whether students can vote based on their age.
import java.util.*;

public class AgeForVoting {
	public static void main (String[] args) {
		
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Declare an array to store ages of 10 students 
		int numOfStudents = 10;
		int[] age = new int[numOfStudents];
		
		//Used for loop to take all the students age
		for (int i=0; i<age.length; i++) {
			age[i] = input.nextInt();
	    }
		
		//Check voting eligibility for each student
		for (int i=0; i<age.length; i++) {
			if (age[i] < 0) {
            System.out.println("Invalid age: " + age[i]);
			} else if (age[i] >= 18) {
            System.out.println("The student with the age " + age[i] + " can vote.");
			} else {
            System.out.println("The student with the age " + age[i] + " cannot vote.");
			}
		}
    }
}