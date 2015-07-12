/*
Write a program that prompts the user for a radius and then prints
•    The area and circumference of a circle with that radius
•    The volume and surface area of a sphere with that radius
*/

import java.util.Scanner;

public class P2_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a radius: ");
        double radius = in.nextDouble();

        double areaOfCircle = Math.PI * radius * radius;
        double circumferenceOfCircle = 2 * Math.PI * radius;
        double volumeOfSphere = (4 / 3) * Math.PI * Math.pow(radius, 3);
        double surfaceAreaOfSphere = 4 * Math.PI * radius * radius;

        System.out.printf("Area of circle is: %.2f\n", areaOfCircle);
        System.out.printf("Circumference of circle is: %.2f\n", circumferenceOfCircle);
        System.out.printf("Volume of sphere is: %.2f\n", volumeOfSphere);
        System.out.printf("Surface area of sphere is: %.2f\n", surfaceAreaOfSphere);

        in.close();
    }
}