/*Using recursion, find the largest element in an array.
Hint: Find the largest element in the subset containing all but the last element.
Then compare that maxi­mum to the value of the last element.*/
package tasks;

public class LargestElementFinder {

    public static int findLargestElement(int[] array) {
        return findLargestElement(array, array.length - 1, Integer.MIN_VALUE);
    }

    public static int findLargestElement(int[] array, int lastIndex, int currentLargest) {
        if (lastIndex >= 0) {
            int lastElement = array[lastIndex];

            if (lastElement > currentLargest) {
                currentLargest = lastElement;
            }

            return findLargestElement(array, lastIndex - 1, currentLargest);
        } else {
            return currentLargest;
        }
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 4444, 24, 52, 555, 66 };
        int largestElement = findLargestElement(array);
        System.out.printf("Largest element in array is: %d", largestElement);
    }
}