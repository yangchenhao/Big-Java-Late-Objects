/*Write a method
 public static boolean equals(int[] a, int[] b)
 that checks whether two arrays have the same elements in the same order.*/

import java.util.Scanner;

public class P6_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] firstArray = new int[10];
        for (int i = 0; i < firstArray.length; i++) {
            System.out.printf("%d element of array: ", i + 1);
            firstArray[i] = input.nextInt();
        }

        int[] secondArray = new int[10];
        for (int i = 0; i < secondArray.length; i++) {
            System.out.printf("%d element of array: ", i + 1);
            secondArray[i] = input.nextInt();
        }

        boolean isEqual = equals(firstArray, secondArray);
        if (isEqual) {
            System.out.println("Arrays are equal!");
        } else {
            System.out.println("Arrays are not equal!");
        }

        input.close();
    }

    public static boolean equals(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }
}