/*
Write a program that displays the dimensions of a letter-size
(8.5 × 11 inches) sheet of paper in millimeters. There are 25.4 millimeters
per inch. Use con­stants and comments in your program.
*/

import java.util.Scanner;

public class P2_01 {
    public static void main(String[] args) {
        final double MILLIMETERS_PER_INCH = 25.4;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Height: ");
        double heightInInches = in.nextDouble();
        double heightInMillimeters = heightInInches * MILLIMETERS_PER_INCH;

        System.out.print("Enter Width: ");
        double widthInInches = in.nextDouble();
        double widthInMillimeters = widthInInches * MILLIMETERS_PER_INCH;

        System.out.println("Dimensions of letter in millimeters are: ");
        System.out.printf("%.2f - Height \n", heightInMillimeters);
        System.out.printf("%.2f - Width \n", widthInMillimeters);

        in.close();
    }
}