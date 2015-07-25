/*Write methods
 public static double sphereVolume(double r)
 public static double sphereSurface(double r)
 public static double cylinderVolume(double r, double h)
 public static double cylinderSurface(double r, double h)
 public static double coneVolume(double r, double h)
 public static double coneSurface(double r, double h)
 that compute the volume and surface area of a sphere with radius r , a cylinder with a
 circular base with radius r and height h , and a cone with a circular base with radius r
 and height h . Then write a program that prompts the user for the values of r and h ,
 calls the six methods, and prints the results.*/

import java.util.Scanner;

public class P5_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter radius r: ");
        double radius = input.nextDouble();
        System.out.print("Please enter height h: ");
        double height = input.nextDouble();
        input.close();

        System.out.println(sphereVolume(radius));
        System.out.println(sphereSurface(radius));
        System.out.println(cylinderVolume(radius, height));
        System.out.println(cylinderSurface(radius, height));
        System.out.println(coneVolume(radius, height));
        System.out.println(coneSurface(radius, height));
    }

    public static double sphereVolume(double r) {
        return (4.0 / 3.0) * Math.PI * r * r * r;
    }

    public static double sphereSurface(double r) {
        return 4 * Math.PI * r * r;
    }

    public static double cylinderVolume(double r, double h) {
        return Math.PI * r * r * h;
    }

    public static double cylinderSurface(double r, double h) {
        return 2 * Math.PI * r * (r + h);
    }

    public static double coneVolume(double r, double h) {
        return (1.0 / 3.0) * Math.PI * r * r * h;
    }

    public static double coneSurface(double r, double h) {
        double l = Math.sqrt(r * r + h * h);

        return Math.PI * r * (r + l);
    }
}