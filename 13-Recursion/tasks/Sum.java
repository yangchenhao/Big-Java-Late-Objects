/*Using recursion, compute the sum of all values in an array.*/
package tasks;

public class Sum {
    public static int sum(int[] array) {
        return sum(array, 0, 0);
    }

    public static int sum(int[] array, int currentIndex, int currentSum) {
        if (currentIndex == array.length) {
            return currentSum;
        } else {
            currentSum += array[currentIndex];
            return sum(array, currentIndex + 1, currentSum);
        }
    }

    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 5, 15 };
        int sum = sum(array);
        System.out.printf("Sum of elements in array is: %d", sum);
    }
}