/*Implement a class Moth that models a moth flying in a straight line. The moth has a
position, the distance from a fixed origin. When the moth moves toward a point of
light, its new position is halfway between its old position and the position of the
light source. Supply a constructor
public Moth(double initialPosition)
and methods
•    public void moveToLight(double lightPosition)
•    public void getPosition()
Your main method should construct a moth, move it toward a couple of light sources,
and check that the moth’s position is as expected.*/

public class P8_13 {
    private double position;

    public P8_13(double initialPosition) {
        this.position = initialPosition;
    }

    public void moveToLight(double lightPosition) {
        this.position += (this.position + lightPosition) / 2;
    }

    public double getPosition() {
        return this.position;
    }
}