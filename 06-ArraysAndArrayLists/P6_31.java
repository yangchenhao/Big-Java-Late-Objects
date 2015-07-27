/*Improve the program of Exercise P6.30 so that it displays the top customers, that is, the
topN customers with the largest sales, where topN is a value that the user of the program supplies.
Implement a method
public static ArrayList<String> nameOfBestCustomers(ArrayList<Double> sales,
ArrayList<String> customers, int topN)
If there were fewer than topN customers, include all of them.*/

import java.util.ArrayList;
import java.util.Scanner;

public class P6_31 {
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

        System.out.print("How many best customers you want to see: ");
        int topN = input.nextInt();

        input.close();

        System.out.println("Top customers of the day are: ");
        ArrayList<String> bestCustomers = nameOfBestCustomers(sales, customers, topN);
        for (int i = 0; i < bestCustomers.size(); i++) {
            System.out.println(bestCustomers.get(i));
        }
    }

    public static ArrayList<String> nameOfBestCustomers(ArrayList<Double> sales, ArrayList<String> customers, int topN) {
        if (topN >= customers.size()) {
            return customers;
        } else {
            ArrayList<String> topCustomers = new ArrayList<String>();

            while (topN > 0) {
                String topCustomer = getTopCustomer(sales, customers);
                topCustomers.add(topCustomer);

                int indexOfCustomer = customers.indexOf(topCustomer);
                sales.remove(indexOfCustomer);
                customers.remove(indexOfCustomer);

                topN--;
            }

            return topCustomers;
        }
    }

    public static String getTopCustomer(ArrayList<Double> sales, ArrayList<String> customers) {
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