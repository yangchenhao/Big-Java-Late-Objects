/*Given a class Rectangle with instance variables width and height,
provide a recursive getArea method. Construct a rectangle whose width is
one less than the original and call its getArea method.*/

package tasks;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        if (this.width == 1) {
            return height;
        } else {
            Rectangle rectangle = new Rectangle(this.width - 1, this.height);
            return this.height + rectangle.getArea();
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.printf("Area of rectangle is: %.2f", rectangle.getArea());
    }
}