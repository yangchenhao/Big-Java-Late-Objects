/*Solve Exercise P8.14 by implementing classes Sphere , Cylinder , and Cone . Which
approach is more object-oriented?*/

public class P8_15A {
    private double radius;

    public P8_15A(int radius) {
        this.radius = radius;
    }

    public double sphereVolume() {
        return (4.0 / 3.0) * Math.PI * this.radius * this.radius * this.radius;
    }

    public double sphereSurface() {
        return 4 * Math.PI * this.radius * this.radius;
    }
}