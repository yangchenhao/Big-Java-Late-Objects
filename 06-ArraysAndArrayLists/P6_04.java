/*Write a method sumWithoutSmallest that computes the sum of an array of values,
except for the smallest one, in a single loop. In the loop, update the sum and the
smallest value. After the loop, return the difference.*/

import java.util.Scanner;

public class P6_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d element of array: ", i + 1);
            array[i] = input.nextInt();
        }
        input.close();

        int sum = sumWithoutSmallest(array);
        System.out.printf("Sum without smallest one is: %d\n", sum);
    }

    public static int sumWithoutSmallest(int[] array) {
        int smallestValue = array[0];
        int sum = smallestValue;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallestValue) {
                smallestValue = array[i];
            }
            sum += array[i];
        }

        return sum - smallestValue;
    }
}