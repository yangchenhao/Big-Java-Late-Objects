/*Solve Exercise P8.14 by implementing classes Sphere , Cylinder , and Cone . Which
approach is more object-oriented?*/

public class P8_15B {
    private double radius;
    private double height;

    public P8_15B(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public double cylinderVolume() {
        return Math.PI * this.radius * this.radius * this.height;
    }

    public double cylinderSurface() {
        return 2 * Math.PI * this.radius * (this.radius + this.height);
    }
}