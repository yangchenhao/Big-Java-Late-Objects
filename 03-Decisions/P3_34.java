/*A supermarket awards coupons depending on how much a customer spends on
 groceries. For example, if you spend $50, you will get a coupon worth eight percent
 of that amount. The following table shows the percent used to calculate the coupon
 awarded for different amounts spent. Write a program that calculates and prints the
 value of the coupon a person can receive based on groceries purchased.
 Here is a sample run:
 Please enter the cost of your groceries: 14
 You win a discount coupon of $ 1.12. (8% of your purchase)*/

import java.util.Scanner;

public class P3_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter groceries price: ");
        double groceries = input.nextInt();

        input.close();

        double couponPrice = 0;
        if (groceries > 10 && groceries < 60) {
            couponPrice = groceries * 0.08;
        }
        else if (groceries > 60 && groceries < 150) {
            couponPrice = groceries * 0.1;
        }
        else if (groceries > 150 && groceries < 210) {
            couponPrice = groceries * 0.12;
        }
        else if (groceries > 210) {
            couponPrice = groceries * 0.14;
        }

        if (couponPrice > 0) {
            System.out.printf("You win a coupon with price of %.2f", couponPrice);
        }
        else {
            System.out.printf("You don't win a coupon!");
        }
    }
}