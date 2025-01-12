import java.util.*;

public class RandomValueStats {

    //Method to generate an array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = (int) (Math.random() * 9000) + 1000; // 4-digit range: 1000 to 9999
        }
        return randomNumbers;
    }

    //Method to find average, min, and max of an array
    public double[] findAverageMinMax(int[] numbers) {
        int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }
        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    //Main function
    public static void main(String[] args) {
        RandomValueStats stats = new RandomValueStats();

        //Generate 5 random 4-digit numbers
        int[] randomNumbers = stats.generate4DigitRandomArray(5);
        System.out.println("Generated random numbers: " + Arrays.toString(randomNumbers));

        //Find average, min, and max
        double[] results = stats.findAverageMinMax(randomNumbers);
		
		//Print Average, Minimum, Maximum
        System.out.printf("Average: %.2f%n", results[0]);
        System.out.println("Minimum: " + (int) results[1]);
        System.out.println("Maximum: " + (int) results[2]);
    }
}
