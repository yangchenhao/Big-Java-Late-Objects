/*Write a program that reads in two floating-point numbers and tests whether they are
the same up to two decimal places. Here are two sample runs.
Enter two floating-point numbers: 2.0 1.99998
They are the same up to two decimal places.
Enter two floating-point numbers: 2.0 1.98999
They are different.*/

import java.util.Scanner;

public class P3_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double first = input.nextDouble();
        double second = input.nextDouble();

        if (Math.abs(first - second) < 0.01) {
            System.out.println("They are the same!");
        }
        else {
            System.out.println("They are different!");
        }

        input.close();
    }
}