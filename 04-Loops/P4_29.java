/*Your company has shares of stock it would like to sell when their value exceeds a
certain target price. Write a program that reads the target price and then reads the
current stock price until it is at least the target price. Your program should use a
Scanner to read a sequence of double values from standard input. Once the minimum
is reached, the program should report that the stock price exceeds the target price.*/

import java.util.Scanner;

public class P4_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter target price: ");
        double targetPrice = input.nextDouble();

        System.out.print("Enter current stock price: ");
        double currentStockPrice = 0;

        while (input.hasNextDouble()) {
            currentStockPrice = input.nextDouble();
            if (currentStockPrice >= targetPrice) {
                break;
            }
        }

        System.out.println("Stock price exceed target price!");
        System.out.printf("Stock price is: %.2f", currentStockPrice);

        input.close();
    }
}