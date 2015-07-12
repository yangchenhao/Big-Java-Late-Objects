/*
Write a program that helps a person decide whether to buy a hybrid car. Your
pro­gram’s inputs should be:
•    The cost of a new car
•    The estimated miles driven per year
•    The estimated gas price
•    The efficiency in miles per gallon
•    The estimated resale value after 5 years
Compute the total cost of owning the car for five years.
(For simplic­ity, we will not take the cost of financing into account.)
Obtain realistic prices for a new and used hybrid
and a com­parable car from the Web. Run your program twice, using today’s gas
price and 15,000 miles per year. Include pseudocode and the program runs with your
assignment.
*/

import java.util.Scanner;

public class P2_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter cost of new car: ");
        double costNewCar = in.nextDouble();

        System.out.print("Please enter estimated miles per year: ");
        int milesPerYear = in.nextInt();

        System.out.print("Please enter estimated gas price: ");
        double gasPrice = in.nextDouble();

        System.out.print("Please enter the efficiency in miles per gallon: ");
        double milesPerGallon = in.nextDouble();

        System.out.print("Please enter estimated resale value after 5 years: ");
        double resaleValue = in.nextDouble();

        double totalCost = costNewCar + (milesPerYear / milesPerGallon) * gasPrice;

        // If is positive you are at a loss, else if is negative you are at a profit
        double costAfterResale = totalCost - resaleValue;

        System.out.printf("Total cost for car after five years is: %.2f\n", totalCost);
        System.out.printf("Cost for car after resale is: %.2f\n", costAfterResale);

        in.close();
    }
}