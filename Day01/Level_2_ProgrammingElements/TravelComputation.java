import java.util.*;

class TravelComputation{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for the traveler's name
        System.out.print("Enter the name of the person traveling: ");
        String name = input.nextLine();

        // Taking user input for cities
        System.out.print("Enter the city the person is traveling from: ");
        String fromCity = input.nextLine();

        System.out.print("Enter the city the person is traveling via: ");
        String viaCity = input.nextLine();

        System.out.print("Enter the destination city: ");
        String toCity = input.nextLine();

        // Taking user input for distances
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in km): ");
        double distanceFromToVia = input.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in km): ");
        double distanceViaToFinalCity = input.nextDouble();

        // Taking user input for times
        System.out.print("Enter the time taken to travel from " + fromCity + " to " + viaCity + " (in minutes): ");
        int timeFromToVia = input.nextInt();

        System.out.print("Enter the time taken to travel from " + viaCity + " to " + toCity + " (in minutes): ");
        int timeViaToFinalCity = input.nextInt();

        // Calculating total distance and time
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Printing the travel details
        System.out.println("The Total Distance travelled by " + name + " from " + 
                           fromCity + " to " + toCity + " via " + viaCity + 
                           " is " + totalDistance + " km and " +
                           "the Total Time taken is " + totalTime + " minutes.");
    }
}
