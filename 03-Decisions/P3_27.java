/*Write a program that asks the user to enter a month (1 for January, 2 for February,
and so on) and then prints the number of days in the month. For February, print “28
or 29 days”.
Enter a month: 5
30 days
Do not use a separate if/else branch for each month. Use Boolean operators.*/

import java.util.Scanner;

public class P3_27 {
    public static void main(String[] args) {
        System.out.print("Enter a month: ");
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        input.close();

        if (month == 2) {
            System.out.println("28 or 29 days in leap year!");
        }
        else if (month <= 7) {
            if (month % 2 == 1) {
                System.out.println("31 days");
            }
            else {
                System.out.println("30 days");
            }

        }
        else {
            if (month % 2 == 1) {
                System.out.println("30 days");
            }
            else {
                System.out.println("31 days");
            }
        }
    }
}