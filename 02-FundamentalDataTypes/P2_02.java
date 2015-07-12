/*
 Write a program that computes and displays
 the perimeter of a letter-size (8.5 × 11 inches)
 sheet of paper and the length of its diagonal.
*/

import java.util.Scanner;

public class P2_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Height: ");
        double height = in.nextDouble();

        System.out.print("Enter Width: ");
        double width = in.nextDouble();

        double letterPerimeter = (height + width) * 2;
        double letterArea = height * width;
        double letterDiagonal = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));

        System.out.println("Perimeter is: " + letterPerimeter);
        System.out.println("Area is: " + letterArea);
        System.out.println("Diagonal is: " + letterDiagonal);

        in.close();
    }
}