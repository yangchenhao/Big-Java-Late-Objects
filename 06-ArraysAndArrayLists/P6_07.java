/*Write a method that reverses the sequence of elements in an array. For example, if
you call the method with the array
1  4  9  16  9  7  4  9  11
then the array is changed to
11  9  4  7  9  16  9  4  1*/

import java.util.Arrays;
import java.util.Scanner;

public class P6_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d element of array: ", i + 1);
            array[i] = input.nextInt();
        }
        input.close();

        reverse(array);
        System.out.printf("Reversed array: %s", Arrays.toString(array));
    }

    public static void reverse(int[] array) {
        int middleIndex = (array.length) / 2;

        for (int i = 0; i < middleIndex; i++) {
            int temporaryVariable = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temporaryVariable;
        }
    }
}