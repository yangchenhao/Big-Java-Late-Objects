/*Reimplement the LabeledPoint class of Exercise P9.12 by storing the location in a
java.awt.Point object. Your toString method should invoke the toString method of
the Point class.*/

import java.awt.Point;

@SuppressWarnings("serial")
public class ModifiedPoint extends Point {
    private String label;

    public ModifiedPoint(int x, int y, String label) {
        super(x, y);
        this.setLabel(label);
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String toString() {
        return super.toString() + String.format("[label=\"%s\"]", this.getLabel());
    }
}