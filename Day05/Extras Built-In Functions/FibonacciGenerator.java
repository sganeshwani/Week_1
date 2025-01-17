//Program for generating fibonacci

import java.util.*;

public class FibonacciGenerator {

    //method for generating fibonacci
    public static void generateFibonacci(int terms) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms for the Fibonacci sequence:");
        int terms = sc.nextInt();

        generateFibonacci(terms);

    }
}
