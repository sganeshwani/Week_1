import java.util.*;

public class StudentScorecard {

    public static void main(String[] args) {
        int numStudents = 5; // Define the number of students
        int[][] scores = generateScores(numStudents);
        double[][] results = calculateResults(scores);
        String[][] grades = calculateGrades(results);
        displayScorecard(scores, results, grades);
    }

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math for each student
    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(100) + 1; // Physics score
            scores[i][1] = random.nextInt(100) + 1; // Chemistry score
            scores[i][2] = random.nextInt(100) + 1; // Math score
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][4];
        for (int i = 0; i < scores.length; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Round percentage to 2 decimal places
            results[i][3] = percentage;
        }
        return results;
    }

    // Method to calculate grade based on percentage
    public static String[][] calculateGrades(double[][] results) {
        String[][] grades = new String[results.length][2];
        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][3];
            if (percentage >= 80) {
                grades[i][0] = "A";
                grades[i][1] = "(Level 4, above agency-normalized standards)";
            } else if (percentage >= 70) {
                grades[i][0] = "B";
                grades[i][1] = "(Level 3, at agency-normalized standards)";
            } else if (percentage >= 60) {
                grades[i][0] = "C";
                grades[i][1] = "(Level 2, below, but approaching agency-normalized standards)";
            } else if (percentage >= 50) {
                grades[i][0] = "D";
                grades[i][1] = "(Level 1, well below agency-normalized standards)";
            } else if (percentage >= 40) {
                grades[i][0] = "E";
                grades[i][1] = "(Level 1-, too below agency-normalized standards)";
            } else {
                grades[i][0] = "R";
                grades[i][1] = "(Remedial standards)";
            }
        }
        return grades;
    }

    // Method to display the scorecard for all students
    public static void displayScorecard(int[][] scores, double[][] results, String[][] grades) {
        System.out.println("Student Scorecard:");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", "Student", "Physics", "Chemistry", "Math", "Total", "Percentage", "Grade");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d%-10d%-10d%-10d%-10d%-10.2f%-10s\n", 
                (i + 1), 
                scores[i][0], 
                scores[i][1], 
                scores[i][2], 
                (int) results[i][0], 
                results[i][2], 
                grades[i][0] + " " + grades[i][1]);
        }
    }
}
