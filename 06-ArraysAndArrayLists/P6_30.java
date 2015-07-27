/*A supermarket wants to reward its best customer of each day,
showing the customer’s name on a screen in the supermarket.
For that purpose, the customer’s purchase amount is stored in an
ArrayList<Double> and the customer’s name is stored in a
corresponding ArrayList<String >. Implement a method
public static String nameOfBestCustomer(ArrayList<Double> sales, ArrayList<String> customers)
that returns the name of the customer with the largest sale.
Write a program that prompts the cashier to enter all prices and names, adds them to
two array lists, calls the method that you implemented, and displays the result. Use a
price of 0 as a sentinel.*/

import java.util.ArrayList;
import java.util.Scanner;

public class P6_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Double> sales = new ArrayList<Double>();
        ArrayList<String> customers = new ArrayList<String>();

        boolean isPriceZero = false;
        while (!isPriceZero) {
            System.out.println("Please enter a sale and customer!");
            System.out.print("Sale: ");
            double sale = input.nextDouble();

            if (sale != 0) {
                sales.add(sale);
                System.out.print("Customer: ");
                String customer = input.next();
                customers.add(customer);
            } else {
                isPriceZero = true;
                System.out.println("End of sales and persons!");
            }
        }

        input.close();

        String bestCustomer = nameOfBestCustomer(sales, customers);
        System.out.printf("Best customer of the day is: %s!", bestCustomer);
    }

    public static String nameOfBestCustomer(ArrayList<Double> sales, ArrayList<String> customers) {
        double biggestSale = 0;
        int indexOfBiggestSale = 0;

        for (int i = 0; i < sales.size(); i++) {
            double currentSale = sales.get(i);

            if (currentSale > biggestSale) {
                biggestSale = currentSale;
                indexOfBiggestSale = i;
            }
        }

        return customers.get(indexOfBiggestSale);
    }
}