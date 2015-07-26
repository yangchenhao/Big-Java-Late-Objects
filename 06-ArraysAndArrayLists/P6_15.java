/*Write a program that produces ten random permutations of the numbers 1 to 10. To
 generate a random permutation, you need to fill an array with the numbers 1 to 10
 so that no two entries of the array have the same contents. You could do it by brute
 force, by generating random values until you have a value that is not yet in the array.
 But that is inefficient. Instead, follow this algorithm.
 Make a second array and fill it with the numbers 1 to 10.
 Repeat 10 times
 Pick a random element from the second array.
 Remove it and append it to the permutation array.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class P6_15 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> filledArray = fillArray();

        int[] randomArray = new int[10];
        for (int i = 0; i < randomArray.length; i++) {
            int randomPosition = random.nextInt(10 - i) + 1;
            randomArray[i] = filledArray.get(randomPosition);
            filledArray.remove(randomPosition);
        }

        System.out.print("Random generated array: ");
        printArray(randomArray);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    public static ArrayList<Integer> fillArray() {
        ArrayList<Integer> randomArray = new ArrayList<Integer>();
        randomArray.add(0);
        randomArray.add(1);
        randomArray.add(2);
        randomArray.add(3);
        randomArray.add(4);
        randomArray.add(5);
        randomArray.add(6);
        randomArray.add(7);
        randomArray.add(8);
        randomArray.add(9);
        randomArray.add(10);

        return randomArray;
    }
}