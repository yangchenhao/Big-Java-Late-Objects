/*Write a program that first asks the user
to type in today’s price of one dollar
in Jap­anese yen, then reads U.S. dollar
values and converts each to Japanese
yen. Use 0 as the sentinel value to denote the end of dollar inputs. Then the program
reads a sequence of yen amounts and converts them to dollars. The second sequence
is ter­minated by another zero value.*/

import java.util.Scanner;

public class P4_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter price of 1$ in JPY(Japanese yen): ");
        double priceOfDollar = input.nextDouble();

        System.out.printf("Enter dollar value: ");
        while (input.hasNextDouble()) {
            double dollarValue = input.nextDouble();

            if (dollarValue == 0) {
                break;
            }

            double yen = dollarValue * priceOfDollar;
            System.out.printf("%.2f$ in yen are: %.2f", dollarValue, yen);
        }

        System.out.printf("Enter yen value: ");
        while (input.hasNextDouble()) {
            double yenValue = input.nextDouble();

            if (yenValue == 0) {
                break;
            }

            double dollars = yenValue / priceOfDollar;
            System.out.printf("%.2f yen in dollars are: %.2f", yenValue, dollars);
        }

        input.close();
    }
}