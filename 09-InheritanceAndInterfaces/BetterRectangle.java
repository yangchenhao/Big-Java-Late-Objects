/*The Rectangle class of the standard Java library does not supply a method to com­pute
the area or the perimeter of a rectangle. Provide a subclass BetterRectangle of the
Rectangle class that has getPerimeter and getArea methods. Do not add any instance
variables. In the constructor, call the setLocation and setSize methods of the Rectangle
class. Provide a program that tests the methods that you supplied.

Repeat Exercise P9.10, but in the BetterRectangle constructor, invoke the superclass
constructor.*/

import java.awt.Rectangle;

@SuppressWarnings("serial")
public class BetterRectangle extends Rectangle {

    public BetterRectangle(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    /*public BetterRectangle(int x, int y, int width, int height) {
        this.setLocation(x, y);
        this.setSize(width, height);
    }*/

    public double getPerimeter() {
        return 2 * super.getHeight() + 2 * super.getWidth();
    }

    public double getArea() {
        return super.getHeight() * super.getWidth();
    }
}