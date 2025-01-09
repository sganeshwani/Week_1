import java.util.Scanner;

import java.util.*;
public class AthleteRun{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter sides in meter-");
        System.out.print("Enter side 1 : ");
        int side1 = input.nextInt();
        
        System.out.print("Enter side 2 : ");
        int side2 = input.nextInt();
        
        System.out.print("Enter side 3 : ");
        int side3 = input.nextInt();

        // Calculating the perimeter
        int perimeter = side1 + side2 + side3;

        // Calculating number of rounds
        double rounds = 5000 / perimeter;

        // Displaying the result
        System.out.println("The total number of rounds the athlete will run is " + 	Math.ceil(rounds) + " to complete 5 km.");
    }
}
