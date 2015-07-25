/*Write the following methods and provide a program to test them.
a.   double smallest(double x, double y, double z) , returning the smallest of the
arguments
b.   double average(double x, double y, double z) , returning the average of the
arguments*/

public class P5_01 {
    public static void main(String[] args) {
        System.out.println(smallest(3, 4, 5));
        System.out.println(smallest(3, 3, 6));
        System.out.println(average(1, 2, 3));
        System.out.println(average(3, 3, 3));
    }

    public static double smallest(double x, double y, double z) {
        return Math.min(Math.min(x, y), z);
    }

    public static double average(double x, double y, double z) {
        return (x + y + z) / 3;
    }
}