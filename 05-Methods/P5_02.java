/*Write the following methods and provide a program to test them.
a.   boolean allTheSame(double x, double y, double z) , returning true if the arguments are all the same
b.   boolean allDifferent(double x, double y, double z) , returning true if the arguments are all different
c.   boolean sorted(double x, double y, double z) , returning true if the arguments are
sorted, with the smallest one coming first*/

public class P5_02 {
    public static void main(String[] args) {
        System.out.println(allTheSame(3, 3, 3));
        System.out.println(allTheSame(3, 4, 4));
        System.out.println(allTheSame(3, 4, 5));

        System.out.println(allDifferent(3, 4, 5));
        System.out.println(allDifferent(3, 4, 4));
        System.out.println(allDifferent(3, 3, 3));

        System.out.println(sorted(3, 4, 5));
        System.out.println(sorted(5, 4, 3));
        System.out.println(sorted(4, 4, 4));
    }

    public static boolean allTheSame(double x, double y, double z) {
        return x == y && y == z;
    }

    public static boolean allDifferent(double x, double y, double z) {
        return x != y && y != z && x != z;
    }

    public static boolean sorted(double x, double y, double z) {
        return x < y && y < z;
    }
}