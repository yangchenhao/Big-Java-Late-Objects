/*A pet shop wants to give a discount to its clients if they buy one
or more pets and at least five other items. The discount is equal
to 20 percent of the cost of the other items, but not the pets.
Implement a method
public static void discount(double[] prices, boolean[] isPet, int nItems)
The method receives information about a particular sale. For the ith item, prices[i] is
the price before any discount, and isPet[i] is true if the item is a pet.
Write a program that prompts a cashier to enter each price and then a Y for a pet or N
for another item. Use a price of –1 as a sentinel. Save the inputs in an array. Call the
method that you implemented, and display the discount.*/

import java.util.ArrayList;
import java.util.Scanner;

public class P6_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Double> prices = new ArrayList<Double>();
        ArrayList<Character> isPet = new ArrayList<Character>();

        boolean isPrice = true;
        while (isPrice) {
            System.out.println("Please enter a new item!");
            System.out.print("Price: ");
            double price = input.nextDouble();

            if (price != -1) {
                prices.add(price);
                System.out.print("Is Pet? (Y/N): ");
                char pet = input.next().charAt(0);
                isPet.add(pet);
            } else {
                isPrice = false;
                System.out.println("End of items!");
            }
        }

        input.close();

        double[] allPrices = new double[prices.size()];
        for (int i = 0; i < prices.size(); i++) {
            allPrices[i] = prices.get(i);
        }

        boolean[] allPets = new boolean[isPet.size()];
        for (int i = 0; i < isPet.size(); i++) {
            if (isPet.get(i) == 'Y') {
                allPets[i] = true;
            } else if (isPet.get(i) == 'N') {
                allPets[i] = false;
            }
        }

        int times = allPrices.length;
        discount(allPrices, allPets, times);
    }

    public static void discount(double[] prices, boolean[] isPet, int nItems) {
        int sumPriceOfItems = 0;

        for (int i = 0; i < nItems; i++) {
            if (!isPet[i]) {
                sumPriceOfItems += prices[i];
            }
        }

        System.out.printf("Discount is: %.2f", sumPriceOfItems * 0.2);
    }
}