/*
Improve the program discussed in How To 2.1 to allow input of quar­ters in addition
to bills.
*/

import java.util.Scanner;

public class P2_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int PENNIES_PER_DOLLAR = 100;
        final int PENNIES_PER_QUARTER = 25;

        System.out.print("Enter dollar value (1 = $1 dollar, 5 = $5 dollar, etc.): ");
        int dollarValue = in.nextInt();

        System.out.print("Enter quarter value (1 = $0.25 dollar, 2 = $0.50 dollar, etc.): ");
        int quarterValue = in.nextInt();

        System.out.print("Enter item price in pennies: ");
        int itemPrice = in.nextInt();

        // Compute change due
        int valueInPennies = PENNIES_PER_DOLLAR * dollarValue + PENNIES_PER_QUARTER * quarterValue;
        int changeInPennies = valueInPennies - itemPrice;

        int dollarCoins = changeInPennies / PENNIES_PER_DOLLAR;
        changeInPennies = changeInPennies % PENNIES_PER_DOLLAR;
        int quarterCoins = changeInPennies / PENNIES_PER_QUARTER;

        System.out.printf("Dollar coins:    %5d", dollarCoins);
        System.out.println();
        System.out.printf("Quarters coins:  %5d", quarterCoins);
        System.out.println();

        in.close();
    }
}