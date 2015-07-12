/*
Enhance the output of Exercise P2.4 so that the numbers are properly aligned:
Sum:             45
Difference:      -5
Product:        500
Average:         22.50
Distance:         5
Maximum:         25
Minimum:         20
*/

import java.util.Scanner;

public class P2_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a first number: ");
        int first = in.nextInt();

        System.out.print("Please enter a second number: ");
        int second = in.nextInt();

        int sum = first + second;
        int difference = first - second;
        int product = first * second;
        int average = (first + second) / 2;
        int distance = Math.abs(difference);
        int maximum = Math.max(first, second);
        int minimum = Math.min(first, second);

        System.out.printf("Sum is:         %5d\n", sum);
        System.out.printf("Difference is:  %5d\n", difference);
        System.out.printf("Product is:     %5d\n", product);
        System.out.printf("Average is:     %5d\n", average);
        System.out.printf("Distance is:    %5d\n", distance);
        System.out.printf("Maximum is:     %5d\n", maximum);
        System.out.printf("Minimum is:     %5d\n", minimum);

        in.close();
    }
}