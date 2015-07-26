/*Write a program that generates a sequence of 20 random values between 0 and 99 in
an array, prints the sequence, sorts it, and prints the sorted sequence. Use the sort
method from the standard Java library.*/

import java.util.Arrays;
import java.util.Random;

public class P6_14 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] values = new int[20];
        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(100);
        }

        System.out.print("Initial values: ");
        printSequence(values);

        sortSequence(values);

        System.out.print("After sorting values: ");
        printSequence(values);
    }

    public static void printSequence(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        System.out.println();
    }

    public static void sortSequence(int[] array) {
        Arrays.sort(array);
    }
}