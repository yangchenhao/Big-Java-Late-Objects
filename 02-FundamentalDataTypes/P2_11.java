/*
Write a program that asks the user to input
•    The number of gallons of gas in the tank
•    The fuel efficiency in miles per gallon
•    The price of gas per gallon
Then print the cost per 100 miles and how far the car can go with the gas in the tank.
*/

import java.util.Scanner;

public class P2_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int hundredMiles = 100;

        System.out.print("Please enter gallons of gas in the tank: ");
        double gallonsOfGasInTank = in.nextDouble();

        System.out.print("Please enter the fuel efficiency in miles per gallon: ");
        double fuelEfficiency = in.nextDouble();

        System.out.print("Please enter the price of gas per gallon: ");
        double pricePerGallon = in.nextDouble();

        double costPerHundredMiles = (hundredMiles / fuelEfficiency) * pricePerGallon;
        System.out.printf("The cost per 100 miles is: %.2f\n", costPerHundredMiles);

        double totalMiles = gallonsOfGasInTank * fuelEfficiency;
        System.out.printf("The miles that car can go are: %.2f\n", totalMiles);

        in.close();
    }
}