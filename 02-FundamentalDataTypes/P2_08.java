/*
Write a program that asks the user for the lengths
of the sides of a rectangle. Then print
•    The area and perimeter of the rectangle
•    The length of the diagonal (use the Pythagorean theorem)
*/

import java.util.Scanner;

public class P2_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter height: ");
        double height = in.nextDouble();
        System.out.println("Please enter width: ");
        double width = in.nextDouble();

        double area = height * width;
        double perimeter = (height + width) * 2;
        double diagonal = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));

        System.out.printf("Area of rectangle is %.2f", area);
        System.out.printf("Perimeter of rectangle is %.2f", perimeter);
        System.out.printf("Diagonal of rectangle is %.2f", diagonal);

        in.close();
    }
}