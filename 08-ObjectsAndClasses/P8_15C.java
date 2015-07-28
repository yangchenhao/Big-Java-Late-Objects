/*Solve Exercise P8.14 by implementing classes Sphere , Cylinder , and Cone . Which
approach is more object-oriented?*/

public class P8_15C {
    private double radius;
    private double height;

    public P8_15C(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public double coneVolume() {
        return (1.0 / 3.0) * Math.PI * this.radius * this.radius * this.height;
    }

    public double coneSurface() {
        double l = Math.sqrt((this.radius * this.radius) + (this.height * this.height));

        return Math.PI * this.radius * (this.radius + l);
    }
}