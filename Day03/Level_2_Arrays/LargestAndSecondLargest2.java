import java.util.*;

public class LargestAndSecondLargest2 {
    public static void main(String[] args) {
        // Initialize variables
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        //create the scanner object
        Scanner input = new Scanner(System.in);
		
		//Take number input from the user 
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Extract digits and store in the array
        while (number != 0) {
            if (index == maxDigit) {
                // Increase maxDigit and create a new array
                maxDigit += 10;
                int[] temp = new int[maxDigit];

                // Copy elements from the current array to the new array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                // Assign the new array to digits
                digits = temp;
            }

            // Add the digit to the array
            digits[index] = number % 10;
            number /= 10;
            index++;
        }

        // Initialize variables to find the largest and second largest
        int largest = 0;
        int secondLargest = 0;

        // Loop through the array to find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

    }
}
