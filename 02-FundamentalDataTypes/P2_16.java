/*
Write a program that reads in an integer and breaks it into a sequence of individual
digits. For example, the input 16384 is displayed as
1 6 3 8 4
You may assume that the input has no more than five digits and is not negative.
 */

import java.util.Scanner;

public class P2_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int first = number / 10000;
        number = number % 10000;

        int second = number / 1000;
        number = number % 1000;

        int third = number / 100;
        number = number % 100;

        int fourth = number / 10;
        number = number % 10;

        int fifth = number;

        System.out.println(first + " " + second + " " + third + " " + fourth + " " + fifth);

        in.close();
    }
}