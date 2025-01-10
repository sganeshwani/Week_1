import java.util.*;

class GradeCalculator2 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        // Create a 2D array to store marks for Physics, Chemistry, and Maths
        double[][] marks = new double[numStudents][3];  // [numStudents][3 subjects]
        double[] percentages = new double[numStudents];  // Array to store percentages
        String[] grades = new String[numStudents];       // Array to store grades

        // Input marks for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print(subject + " marks: ");
                marks[i][j] = input.nextDouble();

                // Validate input for negative marks
                while (marks[i][j] < 0) {
                    System.out.println("Invalid input. Marks cannot be negative.");
                    System.out.print(subject + " marks: ");
                    marks[i][j] = input.nextDouble();
                }
            }

            // Calculate percentage for the current student
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300) * 100;

            // Determine grade based on percentage
            if (percentages[i] >= 80) {
                grades[i] = "A - Remark Level 4, above agency-normalized standard";
            } else if (percentages[i] >= 70) {
                grades[i] = "B - Remark Level 3, at-normalized standard";
            } else if (percentages[i] >= 60) {
                grades[i] = "C - Remark Level 2, below, but approaching agency-normalized standard";
            } else if (percentages[i] >= 50) {
                grades[i] = "D - Remark Level 1, well below agency-normalized standard";
            } else if (percentages[i] >= 40) {
                grades[i] = "E - Remark Level 1, too below agency-normalized standard";
            } else {
                grades[i] = "R - Remark Remedial standards";
            }
        }

        // Display the results
        System.out.println("\nMarks, Percentage, and Grades of Students:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < numStudents; i++) {
            System.out.println((i + 1) + "\t" +
                    marks[i][0] + "\t\t" +
                    marks[i][1] + "\t\t" +
                    marks[i][2] + "\t\t" +
                    percentages[i] + "%\t\t" +
                    grades[i]);
        }
    }
}
