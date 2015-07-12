/*
Write a program that prompts the user for a measurement
in meters and then con­verts it to miles, feet, and inches.
*/

import java.util.Scanner;

public class P2_06 {
    public static void main(String[] args) {

        final double MILES_PER_METER = 0.000621371192;
        final double FEETS_PER_METER = 3.2808399;
        final double INCHES_PER_METER = 39.3700787;

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter measurments in meters: ");
        double measurmentsInMeters = in.nextDouble();

        double measurmentsInMiles = measurmentsInMeters * MILES_PER_METER;
        double measurmentsInFeets = measurmentsInMeters * FEETS_PER_METER;
        double measurmentsInInches = measurmentsInMeters * INCHES_PER_METER;

        System.out.printf("%.2f Meters - %.2f Miles\n", measurmentsInMeters, measurmentsInMiles);
        System.out.printf("%.2f Meters - %.2f Feets\n", measurmentsInMeters, measurmentsInFeets);
        System.out.printf("%.2f Meters - %.2f Inches\n", measurmentsInMeters, measurmentsInInches);

        in.close();
    }
}