/*Write a program that reads in three floating-point numbers and prints the largest of
the three inputs. For example:
Please enter three numbers: 4 9 2.5
The largest number is 9.*/

import java.util.Scanner;

public class P3_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double first = input.nextDouble();
        double second = input.nextDouble();
        double third = input.nextDouble();

        double maximum = Math.max(first, second);

        if (maximum < third) {
            maximum = third;
        }

        System.out.printf("The largest number is %.1f", maximum);

        input.close();
    }
}