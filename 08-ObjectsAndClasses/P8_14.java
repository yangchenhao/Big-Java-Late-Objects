/*Write static methods
•   public static double sphereVolume(double r)
•   public static double sphereSurface(double r)
•   public static double cylinderVolume(double r, double h)
•   public static double cylinderSurface(double r, double h)
•   public static double coneVolume(double r, double h)
•   public static double coneSurface(double r, double h)
that compute the volume and surface area of a sphere with a radius r , a cylinder with
a circular base with radius r and height h , and a cone with a circular base with radius r
and height h . Place them into a class Geom­etry . Then write a program that prompts the
user for the values of r and h , calls the six methods, and prints the results.*/

import java.util.Scanner;

public class P8_14 {
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
        double l = Math.sqrt((r * r) + (h * h));

        return Math.PI * r * (r + l);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter radius: ");
        double radius = input.nextDouble();
        System.out.print("Please enter height: ");
        double height = input.nextDouble();
        input.close();

        double sphereVol = P8_14.sphereVolume(radius);
        double sphereSurf = P8_14.sphereSurface(radius);
        double cylinderVol = P8_14.cylinderVolume(radius, height);
        double cylinderSurf = P8_14.cylinderSurface(radius, height);
        double coneVol = P8_14.coneVolume(radius, height);
        double coneSurf = P8_14.coneSurface(radius, height);

        System.out.printf("Sphere Volume is: %.2f\n", sphereVol);
        System.out.printf("Sphere Surface is: %.2f\n", sphereSurf);
        System.out.printf("Cylinder Volume is: %.2f\n", cylinderVol);
        System.out.printf("Cylinder Surface is: %.2f\n", cylinderSurf);
        System.out.printf("Cone Volume is: %.2f\n", coneVol);
        System.out.printf("Cone Surface is: %.2f\n", coneSurf);
    }
}