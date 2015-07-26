/*Modify the LargestInArray.java program in Section 6.3 to mark both the smallest and
the largest elements.*/

import java.util.Scanner;

public class P6_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d element of array: ", i + 1);
            array[i] = input.nextInt();
        }
        input.close();

        int largest = largestElement(array);
        System.out.printf("Largest element in array is: %d\n", largest);

        int smallest = smallestElement(array);
        System.out.printf("Smallest element in array is: %d\n", smallest);
    }

    public static int largestElement(int[] array) {
        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        return largest;
    }

    public static int smallestElement(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        return smallest;
    }
}