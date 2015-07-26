/*Write a method that implements the algorithm developed in Section 6.6.*/

import java.util.Arrays;
import java.util.Scanner;

public class P6_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d element of array: ", i + 1);
            array[i] = input.nextInt();
        }
        input.close();

        swapElements(array);
        System.out.printf("Swapped elements of array: %s\n", Arrays.toString(array));
    }

    public static void swapElements(int[] array) {
        int i = 0;
        int j = array.length / 2;
        
        while (i < array.length / 2) {
            int temporaryVariable = array[i];
            array[i] = array[j];
            array[j] = temporaryVariable;

            i += 1;
            j += 1;
        }
    }
}