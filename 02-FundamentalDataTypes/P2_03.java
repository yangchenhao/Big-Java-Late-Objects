/*
Write a program that reads a number and displays
the square, cube, and fourth power. Use the Math.pow method
only for the fourth power. 
*/

import java.util.Scanner;

public class P2_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        double number = in.nextDouble();

        double square = number * number;
        double cube = number * number * number;
        double fourth = Math.pow(number, 4);

        System.out.println("Square of number is: " + square);
        System.out.println("Cube of number is: " + cube);
        System.out.println("Fourth of number is: " + fourth);

        in.close();
    }
}