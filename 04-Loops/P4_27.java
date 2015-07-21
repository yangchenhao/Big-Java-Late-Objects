/*Currency conversion. Write a program
that first asks the user to type today’s
price for one dollar in Japanese yen,
then reads U.S. dollar values and
converts each to yen. Use 0 as a sentinel.*/

import java.util.Scanner;

public class P4_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter price for 1$ to JPY(Japanese yen): ");
        double priceForDollar = input.nextDouble();

        System.out.print("USD dollars: ");
        while (input.hasNextDouble()) {
            double dollars = input.nextDouble();
            if (dollars == 0) {
                break;
            }
            double yen = priceForDollar * dollars;
            System.out.printf("%.2f$ to JPY(Japanese yen): %.2f", dollars, yen);
        }

        input.close();
    }
}