/*Write a program that initializes an array with ten random integers and then prints
four lines of output, containing
•    Every element at an even index.
•    Every even element.
•    All elements in reverse order.
•    Only the first and last element.*/

import java.util.Scanner;

public class P6_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d element of array: ", i);
            array[i] = input.nextInt();
        }
        input.close();

        evenIndexElements(array);
        everyEvenElement(array);
        allElementsInReverseOrder(array);
        firstAndLastElement(array);
    }

    public static void evenIndexElements(int[] array) {
        System.out.print("Even index elements are: ");

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.println();
    }

    public static void everyEvenElement(int[] array) {
        System.out.print("Every even element: ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.println();
    }

    public static void allElementsInReverseOrder(int[] array) {
        System.out.print("All elements in reverse order: ");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    public static void firstAndLastElement(int[] array) {
        System.out.print("First and last elements are: ");
        System.out.print(array[0] + " " + array[array.length - 1]);
        System.out.println();
    }
}