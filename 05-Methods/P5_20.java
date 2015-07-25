/*Leap years. Write a method
public static boolean isLeapYear(int year)
that tests whether a year is a leap year: that is, a year with 366 days. Exercise P3.28
describes how to test whether a year is a leap year. In this exercise, use multiple if
statements and return statements to return the result as soon as you know it.*/

import java.util.Scanner;

public class P5_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a year: ");
        int year = input.nextInt();
        System.out.println(isLeapYear(year));
        input.close();
    }

    public static boolean isLeapYear(int year) {
        if (year % 100 == 0) {
            return false;
        }

        if (!(year % 4 == 0 || year % 400 == 0)) {
            return false;
        }

        return true;
    }
}