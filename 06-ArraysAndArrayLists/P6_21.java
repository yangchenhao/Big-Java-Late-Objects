/*Write a program that reads a sequence of input values and displays a bar chart of the
 values, using asterisks, like this:
 **********************
 ****************************************
 ****************************
 **************************
 **************
 You may assume that all values are positive. First figure out the maximum value.
 That value’s bar should be drawn with 40 asterisks. Shorter bars should use
 proportionally fewer asterisks.*/

import java.util.Scanner;

public class P6_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter length of sequence: ");
        int lengthOfSequence = input.nextInt();
        int[] array = new int[lengthOfSequence];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Please enter number: ");
            array[i] = input.nextInt();
        }

        input.close();

        printAsterisks(array);
    }

    public static void printAsterisks(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 40) {
                System.out.println("****************************************");
            } else {
                for (int j = 0; j < array[i]; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }
}