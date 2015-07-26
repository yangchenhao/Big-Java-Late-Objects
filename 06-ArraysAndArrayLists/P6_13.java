/*Write a program that generates a sequence of 20 random die tosses in an array and
that prints the die values, marking only the longest run, like this:
1 2 5 5 3 1 2 4 3 (2 2 2 2) 3 6 5 5 6 3 1
If there is more than one run of maximum length, mark the first one.*/

import java.util.Random;

public class P6_13 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] dieTosses = new int[20];
        for (int i = 0; i < dieTosses.length; i++) {
            dieTosses[i] = random.nextInt(6) + 1;
        }

        System.out.println("Longest run in die tosses: ");
        int startIndex = longestRunStartIndex(dieTosses);
        printDieTosses(dieTosses, startIndex);
    }

    public static void printDieTosses(int[] dieTosses, int startIndex) {
        int dieTossesLength = dieTosses.length;
        int currentIndex = 0;

        while (currentIndex < dieTossesLength) {
            if (currentIndex != startIndex) {
                System.out.print(dieTosses[currentIndex] + " ");
            } else if (currentIndex == startIndex) {
                System.out.print("(");

                while (dieTosses[currentIndex] == dieTosses[startIndex]) {
                    System.out.print(dieTosses[currentIndex] + " ");
                    currentIndex++;
                }

                System.out.print(dieTosses[startIndex] + ") ");
            }

            currentIndex++;
        }

        System.out.println();
    }

    public static int longestRunStartIndex(int[] dieTosses) {
        int previous = dieTosses[0];
        int startIndex = 0;
        int maxLength = 0;
        int currentLength = 1;

        for (int i = 1; i < dieTosses.length; i++) {
            if (dieTosses[i] == previous) {
                currentLength++;
            } else if (dieTosses[i] != previous) {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    startIndex = i - maxLength;
                }

                currentLength = 1;
                previous = dieTosses[i];
            }

            if (i == dieTosses.length - 1) {
                previous = dieTosses[i - 1];

                if (dieTosses[i] == previous) {
                    if (currentLength > maxLength) {
                        maxLength = currentLength;
                    }

                    startIndex = i - maxLength;
                }
            }
        }

        return startIndex;
    }
}