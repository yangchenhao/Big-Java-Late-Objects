/*The boiling point of water drops by about one degree centigrade for every 300
 meters (or 1,000 feet) of altitude. Improve the program of Exercise P3.9 to allow the
 user to supply the altitude in meters or feet.*/

import java.util.Scanner;

public class P3_10 {
    public static void main(String[] args) {
        final int FEETS_PER_DEGREE = 1000;
        final int METERS_PER_DEGREE = 300;
        final double FAHRENHEIT_PER_CELSIUS = 33.8;
        final int BOIL_TEMPERATURE = 100;
        final int SOLID_TEMPERATURE = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter type of degrees (C/F): ");
        char degreesType = in.next().toUpperCase().charAt(0);

        System.out.print("Enter temperature degrees: ");
        double temperature = in.nextDouble();

        System.out.println("Enter altitude (M/F): ");
        char altitudeType = in.next().toUpperCase().charAt(0);

        System.out.println("Enter altitude value: ");
        int altitude = in.nextInt();

        int degreeDropAtCelsius = 0;
        if (altitudeType == 'F') {
            degreeDropAtCelsius = altitude / FEETS_PER_DEGREE;
        }
        else if (altitudeType == 'M') {
            degreeDropAtCelsius = altitude / METERS_PER_DEGREE;
        }

        if (degreesType == 'C') {
            if (temperature <= SOLID_TEMPERATURE - degreeDropAtCelsius) {
                System.out.println("SOLID");
            }
            else if (temperature >= BOIL_TEMPERATURE - degreeDropAtCelsius) {
                System.out.println("BOIL");
            }
            else {
                System.out.println("LIQUID");
            }
        }
        else if (degreesType == 'F') {
            temperature = temperature / FAHRENHEIT_PER_CELSIUS;

            if (temperature <= SOLID_TEMPERATURE - degreeDropAtCelsius) {
                System.out.println("SOLID");
            }
            else if (temperature >= BOIL_TEMPERATURE - degreeDropAtCelsius) {
                System.out.println("BOIL");
            }
            else {
                System.out.println("LIQUID");
            }
        }

        in.close();
    }
}