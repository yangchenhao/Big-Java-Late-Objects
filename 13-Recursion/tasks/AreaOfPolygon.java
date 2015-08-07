/*Using recursion, compute the area of a polygon.*/
package tasks;

public class AreaOfPolygon {

    public static double calculateArea(int[] x, int[] y) {
        return calculateArea(x, y, 1, 0);
    }

    public static double calculateArea(int[] x, int[] y, int indexOfTriangle, int area) {
        if (indexOfTriangle == x.length - 2 && indexOfTriangle == y.length - 2) {
            return area;
        } else {
            double firstPart = x[indexOfTriangle] * y[indexOfTriangle + 1] -
                               y[indexOfTriangle] * x[indexOfTriangle + 1];
            double secondPart = x[indexOfTriangle + 1] * y[indexOfTriangle + 2] -
                                y[indexOfTriangle + 1] * x[indexOfTriangle + 2];
            double thirdPart = x[indexOfTriangle + 2] * y[indexOfTriangle ] -
                               y[indexOfTriangle + 2] * x[indexOfTriangle];
            
            area += Math.abs(firstPart + secondPart + thirdPart) / 2;
            
            return calculateArea(x, y, indexOfTriangle + 1, area);
        }
    }

    public static void main(String[] args) {
        int[] x = { 2, 7, 3, 6, 4, 9 };
        int[] y = { 3, 4, 5, 1, 7, 3 };

        double area = calculateArea(x, y);
        System.out.printf("Area of polygon is: %.2f", area);
    }
}