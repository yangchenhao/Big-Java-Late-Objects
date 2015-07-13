/*Write a program that reads an integer and prints how many digits the number has, by
checking whether the number is ≥ 10, ≥ 100, and so on. (Assume that all integers are
less than ten billion.) If the number is negative, first multiply it with –1.*/

import java.util.Scanner;

public class P3_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long number = in.nextLong();
        int numberOfDigits = 0;

        if (number < 0) {
            number *= -1;
        }

        if (number < 10) {
            numberOfDigits = 1;
        }
        else if (number >= 10 || number < 100) {
            numberOfDigits = 2;
        }
        else if (number >= 100 || number < 1000) {
            numberOfDigits = 3;
        }
        else if (number >= 1000 || number < 10000) {
            numberOfDigits = 4;
        }
        else if (number >= 10000 || number < 100000) {
            numberOfDigits = 5;
        }
        else if (number >= 100000 || number < 1000000) {
            numberOfDigits = 6;
        }
        else if (number >= 1000000 || number < 10000000) {
            numberOfDigits = 7;
        }
        else if (number >= 10000000 || number < 100000000) {
            numberOfDigits = 8;
        }
        else if (number >= 100000000 || number < 1000000000) {
            numberOfDigits = 9;
        }
        else if (number >= 1000000000 || number < 10000000000l) {
            numberOfDigits = 10;
        }
        else {
            System.out.println("Number is greater than 10 billion!");
        }

        System.out.printf("Number of digits: %d", numberOfDigits);

        in.close();
    }
}