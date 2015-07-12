/*
The following pseudocode describes how a bookstore computes the price of an
order from the total price and the number of the books that were ordered.
Read the total book price and the number of books.
Compute the tax (7.5 percent of the total book price).
Compute the shipping charge ($2 per book).
The price of the order is the sum of the total book price, the tax, and the shipping charge.
Print the price of the order.
Translate this pseudocode into a Java program.
*/

import java.util.Scanner;

public class P2_22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int SHIPPING_CHARGE_PER_BOOK = 2;

        double totalBookPrice = in.nextDouble();
        int numberOfbooks = in.nextInt();

        double tax = (totalBookPrice * 7.5) / 100;
        int totalShippingPrice = SHIPPING_CHARGE_PER_BOOK * numberOfbooks;

        double priceOfOrder = totalBookPrice + tax + totalShippingPrice;
        System.out.printf("Total price of order is: %.2f", priceOfOrder);

        in.close();
    }
}