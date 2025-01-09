import java.util.*;
public class ReportCard{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		//Take marks as input from user for all three sybjects
		System.out.println("Enter marks scored in Physics: ");
		int physics = input.nextInt();
		System.out.println("Enter marks scored in Chemistry: ");
		int chemistry = input.nextInt();
		System.out.println("Enter marks scored in Maths: ");
		int maths = input.nextInt();
        //Find average marks
        double averageMarks = (physics+chemistry+maths)/3;
        if(averageMarks<=39){
            System.out.print("Marks " + averageMarks + ", Grade: R " + ", Remarks - Remedial standars");
        }
        else if(averageMarks>=40 && averageMarks<=49){
            System.out.print("Marks " + averageMarks + ", Grade: E" + ", Remarks - Level 1, too below agency-normalized standards");
        }
        else if(averageMarks>=50 && averageMarks<=59){
            System.out.print("Marks " + averageMarks + ", Grade: D" + ", Remarks - Level 1, well below agency-normalized standards");
        }
        else if(averageMarks>=60 && averageMarks<=69){
            System.out.print("Marks " + averageMarks + ", Grade: C" + ", Remarks - Level 2, below, but approaching agency-normalized standards");
        }
        else if(averageMarks>=70 && averageMarks<=79){
            System.out.print("Marks " + averageMarks + ", Grade: B" + ", Remarks - Level 3, at agency-normalized standards");
        }
        else{
            System.out.print("Marks " + averageMarks + ", Grade: A" + ", Remarks - Level 4 , above agency-normalized standards");
        }
	}
}