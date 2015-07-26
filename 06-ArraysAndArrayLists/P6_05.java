/*Write a method public static void removeMin that removes the minimum value from a
partially filled array without calling other methods.*/

import java.util.Arrays;
import java.util.Scanner;

public class P6_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d element of array: ", i + 1);
            array[i] = input.nextInt();
        }
        input.close();

        int[] newArray = removeMin(array);
        System.out.printf("New array is: %s\n", Arrays.toString(newArray));

    }

    public static int[] removeMin(int[] array) {
        int minIndex = 0;
        int[] newArray = new int[array.length - 1];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }

        for (int i = 0; i < minIndex; i++) {
            newArray[i] = array[i];
        }

        for (int i = minIndex + 1; i < array.length; i++) {
            newArray[i - 1] = array[i];
        }

        return newArray;
    }
}