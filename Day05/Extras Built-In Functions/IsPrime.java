//Program to check wheter a number is prime or not
import java.util.*;

public class IsPrime {
    
//Method for checking number is prime or not
    public static boolean Prime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        //Create Scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's prime: ");
        int num = scanner.nextInt();

        if (Prime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
