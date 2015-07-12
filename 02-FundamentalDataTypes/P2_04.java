/*
 Write a program that prompts the user for two integers and then prints
 •    The sum
 •    The difference
 •    The product
 •    The average
 •    The distance (absolute value of the difference)
 •    The maximum (the larger of the two)
 •    The minimum (the smaller of the two)
 Hint: The max and min functions are declared in the Math class.
*/

import java.util.Scanner;

public class P2_04 {
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
        
        System.out.println("Sum is: " + sum);
        System.out.println("Difference is: " + difference);
        System.out.println("Product is: " + product);
        System.out.println("Average is: " + average);
        System.out.println("Distance is: " + distance);
        System.out.println("Maximum is: " + maximum);
        System.out.println("Minimum is: " + minimum);

        in.close();
    }
}