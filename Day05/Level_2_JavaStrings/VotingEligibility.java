import java.util.*;

public class VotingEligibility {

    public static int[] generateStudentAges(int numStudents) {
        Random rand = new Random();
        int[] ages = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            ages[i] = rand.nextInt(18, 31); // Generating ages between 18 and 30
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
        }
        return result;
    }

    public static void displayEligibility(String[][] result) {
        System.out.println("Age | Voting Eligibility");
        System.out.println("------------------------");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "  | " + result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStudents = 10;

        // Generate random ages for 10 students
        int[] studentAges = generateStudentAges(numStudents);

        // Check voting eligibility based on age
        String[][] eligibility = checkVotingEligibility(studentAges);

        // Display the eligibility in tabular format
        displayEligibility(eligibility);
    }
}
