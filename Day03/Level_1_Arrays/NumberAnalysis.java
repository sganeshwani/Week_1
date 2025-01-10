// Program to check if numbers are positive, negative, or zero, determine even or odd for positives,
// and compare first and last elements
import java.util.Scanner;

class NumberAnalysis {
   public static void main(String[] args) {
      // Create a Scanner object
      Scanner input = new Scanner(System.in);

      // Declare an array to store 5 numbers
      int[] numbers = new int[5];

      // Input the numbers
      System.out.println("Enter 5 numbers: ");
      for (int i=0; i<numbers.length; i++) {
         numbers[i] = input.nextInt();
      }

      // Analyze each number
      System.out.println("Number Analysis Results:");
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] > 0) {
            if (numbers[i] % 2 == 0) {
               System.out.println("The number " + numbers[i] + " is positive and even.");
            } else {
               System.out.println("The number " + numbers[i] + " is positive and odd.");
            }
         } else if (numbers[i] < 0) {
            System.out.println("The number " + numbers[i] + " is negative.");
         } else {
            System.out.println("The number " + numbers[i] + " is zero.");
         }
      }

      // Compare the first and last elements of the array
      System.out.println("Comparison of the first and last elements:");
      if (numbers[0] == numbers[4]) {
         System.out.println("The first element " + numbers[0] + " is equal to the last element " + numbers[4] + ".");
      } else if (numbers[0] > numbers[4]) {
         System.out.println("The first element " + numbers[0] + " is greater than the last element " + numbers[4] + ".");
      } else {
         System.out.println("The first element " + numbers[0] + " is less than the last element " + numbers[4] + ".");
      }
   }
}
