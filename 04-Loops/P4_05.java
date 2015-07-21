/*Write a program that reads a set of floating-point values. Ask the user to enter the values, then print
•    the average of the values.
•    the smallest of the values.
•    the largest of the values.
•    the range, that is the difference between the smallest and largest.
Of course, you may only prompt for the values once.*/

import java.util.Scanner;

public class P4_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int average = 0;
        int currentSum = 0;
        int countNumbers = 0;
        int range = 0;

        while (input.hasNextInt()) {
            int newInteger = input.nextInt();

            if (newInteger > largest) {
                largest = newInteger;
            }

            if (newInteger < smallest) {
                smallest = newInteger;
            }

            currentSum += newInteger;
            countNumbers++;
            average = currentSum / countNumbers;

            range = Math.abs(smallest - largest);
        }

        System.out.printf("Smallest value is: % d\n", smallest);
        System.out.printf("Largest value is: % d\n", largest);
        System.out.printf("Average value is: % d\n", average);
        System.out.printf("Range between %d and %d is: %d\n", smallest, largest, range);

        input.close();
    }
}