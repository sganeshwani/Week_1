import java.util.*;
public class EarthVolume{
    public static void main(String[] args) {
        double radiusKm = 6378;
	// 1 mile = 1.609 km
        double radiusMiles = radiusKm / 1.609; 
        // Calculate volume in km
	double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);
        // Calculate volume in miles
	double volumeMiles3 = (4.0 / 3) * Math.PI * Math.pow(radiusMiles, 3);
        System.out.printf("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3 );
    }
}