import java.util.*;

class LargestAndSecondLargest {
    public static void main(String[] args) {
        // Initialize variables
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
		//Create Scanner object
        Scanner input = new Scanner(System.in);
		
        int index = 0;

        // take input of the number from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Extract digits and store in the array
        while (number != 0) {
            if (index == maxDigit) {
                System.out.println("Maximum digit capacity reached, remaining digits are not added.");
                break;
            }
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

        input.close();
    }
}
