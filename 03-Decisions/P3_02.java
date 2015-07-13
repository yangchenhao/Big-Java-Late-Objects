/*Write a program that reads a floating-point number and prints “zero” if the number
is zero. Otherwise, print “positive” or “negative”. Add “small” if the absolute value
of the number is less than 1, or “large” if it exceeds 1,000,000.*/

import java.util.Scanner;

public class P3_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double number = in.nextDouble();
        
        if (number > 0) {
            if (number < 1) {
                System.out.println("Positive small");
            }
            else if (number > 1000000) {
                System.out.println("Positive large");
            }
            else {
                System.out.println("Positive");
            }
        }
        else if (number < 0) {
            if (Math.abs(number) < 1) {
                System.out.println("Negative small");
            }
            else if (Math.abs(number) > 1000000) {
                System.out.println("Negative large");
            }
            else {
                System.out.println("Positive");
            }
        }
        else {
            System.out.println("Zero");
        }

        in.close();
    }
}