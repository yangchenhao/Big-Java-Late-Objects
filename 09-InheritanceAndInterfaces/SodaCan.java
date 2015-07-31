/*Modify the SodaCan class of Exercise P8.5 to implement the Measurable interface. The
measure of a soda can should be its surface area. Write a program that computes the
average surface area of an array of soda cans.*/

public class SodaCan implements Measurable {
    double height;
    double radius;

    public SodaCan(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSurfaceArea() {
        return 2 * Math.PI * this.radius * (this.radius + this.height);
    }

    public double getVolume() {
        return Math.PI * this.radius * this.radius * this.height;
    }

    @Override
    public double getMeasure() {
        return getSurfaceArea();
    }

    public static double averageSurfaceAreaOfSodaCans(Measurable[] sodaCans) {
        double average = 0;

        for (int i = 0; i < sodaCans.length; i++) {
            average += sodaCans[i].getMeasure();
        }

        return average / sodaCans.length;
    }
}