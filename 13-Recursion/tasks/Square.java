/*Given a class Square with instance variable width , provide a recursive getArea method.
Construct a square whose width is one less than the original and call its getArea
method.*/
package tasks;

public class Square {
    private double width;

    public Square(double width) {
        this.width = width;
    }

    public double getArea() {
        if (this.width == 1) {
            return 1;
        } else {
            Square square = new Square(this.width - 1);
            return square.getArea() + 2 * this.width - 1;
        }
    }

    public static void main(String[] args) {
        Square square = new Square(2);
        System.out.printf("Area of square is: %.2f", square.getArea());
    }
}