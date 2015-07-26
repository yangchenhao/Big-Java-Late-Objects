/*Compute the alternating sum of all elements in an array. For example, if your pro­gram
reads the input then it computes
1  4  9  16  9  7  4  9  11
1 – 4 + 9 – 16 + 9 – 7 + 4 – 9 + 11 = –2*/

import java.util.Scanner;

public class P6_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d element of array: ", i + 1);
            array[i] = input.nextInt();
        }
        input.close();

        int sum = alternatingSum(array);
        System.out.printf("Alternating sum is: %d\n", sum);
    }

    public static int alternatingSum(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sum += array[i];
            } else if (i % 2 != 0) {
                sum += -array[i];
            }
        }

        return sum;
    }
}