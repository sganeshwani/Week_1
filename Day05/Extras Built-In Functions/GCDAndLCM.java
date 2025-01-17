//Program to find Greatest common divisor and Least Common Multiple of a Number
import java.util.Scanner;

public class GCDAndLCM {

    //Method to find GCD
    public static int GCD(int a, int b) {
        if (b == 0) return a;
        return GCD(b, a % b);
    }

    //Method to fing LCM
    public static int LCM(int a, int b) {
        return (a * b) / GCD(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("GCD: " + GCD(a, b));
        System.out.println("LCM: " + LCM(a, b));

    }
}
