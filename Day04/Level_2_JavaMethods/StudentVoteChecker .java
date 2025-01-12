import java.util.*;

public class StudentVoteChecker {

    // Method to check if a student can vote
    public boolean canStudentVote(int age) {
        if (age < 0) {
            System.out.println("Invalid age: Age cannot be negative.");
            return false; // Invalid age
        }
        return age >= 18; // Returns true if age is 18 or above
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();

        int[] studentAges = new int[10]; // Array to store ages of 10 students

        // Loop to take input for each student's age
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            studentAges[i] = input.nextInt();
        }

        // Loop to check voting eligibility for each student
        for (int i = 0; i < studentAges.length; i++) {
            boolean canVote = checker.canStudentVote(studentAges[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " is not eligible to vote.");
            }
        }
    }
}
