/*Write a method
public static boolean sameSet(int[] a, int[] b)
that checks whether two arrays have the same elements in some order, ignoring
duplicates. For example, the two arrays
1  4  9  16  9  7  4  9  11
and
11  11  7  9  16  4  1
would be considered identical. You will probably need one or more helper methods.*/

import java.util.Scanner;

public class P6_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] firstArray = new int[5];
        for (int i = 0; i < firstArray.length; i++) {
            System.out.printf("%d element of array: ", i + 1);
            firstArray[i] = input.nextInt();
        }

        int[] secondArray = new int[5];
        for (int i = 0; i < secondArray.length; i++) {
            System.out.printf("%d element of array: ", i + 1);
            secondArray[i] = input.nextInt();
        }

        input.close();

        boolean isSameSets = sameSet(firstArray, secondArray);
        System.out.printf("Is sets same? %s", isSameSets);
    }

    public static boolean sameSet(int[] a, int[] b) {
        boolean isSameNumbers = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    isSameNumbers = true;
                }
            }

            if (!isSameNumbers) {
                return false;
            }
        }

        return true;
    }
}