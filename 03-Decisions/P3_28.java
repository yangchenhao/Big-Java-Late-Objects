/*A year with 366 days is called a leap year. Leap years are necessary to keep the cal­
endar synchronized with the sun because the earth revolves around the sun once
every 365.25 days. Actually, that figure is not entirely precise, and for all dates after
1582 the Gregorian correction applies. Usually years that are divisible by 4 are leap
years, for example 1996. However, years that are divisible by 100 (for example, 1900)
are not leap years, but years that are divisible by 400 are leap years (for exam­ple,
2000). Write a program that asks the user for a year and computes whether that year
is a leap year. Use a single if statement and Boolean operators.*/

import java.util.Scanner;

public class P3_28 {
    public static void main(String[] args) {
        System.out.print("Please enter a year: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        input.close();

        if ((year % 4 == 0 || year % 400 == 0) && !(year % 100 == 0)) {
            System.out.println("Leap!");
        }
        else {
            System.out.println("Not Leap!");
        }
    }
}