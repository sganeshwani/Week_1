// Program to copy elements from a 2D array into a 1D array
import java.util.Scanner;

class TwoDArrayToOneDArray {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Take user input for rows and columns
		System.out.println("Enter the number of rows: ");
		int rows = input.nextInt();
		System.out.println("Enter the number of columns: ");
		int cols = input.nextInt();

		// Create a 2D array (Matrix)
		int[][] matrix = new int[rows][cols];
		System.out.println("Enter the elements of the 2D Array (Matrix): ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = input.nextInt();
			}
		}

		// Create a 1D array to copy the elements
		int[] oneDArray = new int[rows * cols];
		int index = 0;

		// Copy elements from the 2D array to the 1D array
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				oneDArray[index++] = matrix[i][j];
			}
		}
		
		// Display the elements of the 2D array
		System.out.println("The 2D Array (Matrix) is:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		// Display the elements of the 1D array
		System.out.println("The 1D Array is:");
		for (int i = 0; i < oneDArray.length; i++) {
			System.out.print(oneDArray[i] + " ");
		}
		System.out.println();
	}
}
