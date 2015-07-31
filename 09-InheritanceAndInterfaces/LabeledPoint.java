/*A labeled point has x- and y-coordinates and a string label. Provide a class Labeled­Point
 with a constructor LabeledPoint(int x, int y, String label) and a toString method that displays 
 x, y and label*/

public class LabeledPoint {

    private double x;
    private double y;
    private String label;

    public LabeledPoint(int x, int y, String label) {
        this.setX(x);
        this.setY(y);
        this.setLabel(label);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String toString() {
        return "x: " + this.getX() + "\ny: " + this.getY() + "\nlabel:" + this.getLabel();
    }
}