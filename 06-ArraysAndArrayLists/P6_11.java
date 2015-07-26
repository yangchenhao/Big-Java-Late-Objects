/*Write a method
 public static boolean sameElements(int[] a, int[] b)
 that checks whether two arrays have the same elements in some order, with the same
 multiplicities. For example,
 1  4  9  16  9  7  4  9  11
 and
 11  1  4  9  16  9  7  4  9
 would be considered identical, but
 1  4  9  16  9  7  4  9  11
 and
 11  11  7  9  16  4  1  4  9
 would not. You will probably need one or more helper methods.*/

import java.util.Scanner;

public class P6_11 {
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

        boolean isSameElements = sameElements(firstArray, secondArray);
        System.out.printf("Are same elements? %s", isSameElements);
    }

    public static boolean sameElements(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            int currentElement = a[i];

            int firstArrayOccurrences = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == currentElement) {
                    firstArrayOccurrences++;
                }
            }

            int secondArrayOccurences = 0;
            for (int j = 0; j < b.length; j++) {
                if (b[j] == currentElement) {
                    secondArrayOccurences++;
                }
            }

            if (firstArrayOccurrences != secondArrayOccurences) {
                return false;
            }
        }

        return true;
    }
}