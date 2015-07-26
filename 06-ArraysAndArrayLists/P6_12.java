/*A run is a sequence of adjacent repeated values. Write a program that generates a
sequence of 20 random die tosses in an array and that prints the die values, marking
the runs by including them in parentheses, like this:
1 2 (5 5) 3 1 2 4 3 (2 2 2 2) 3 6 (5 5) 6 3 1
Use the following pseudocode:
Set a boolean variable inRun to false.
For each valid index i in the array
     If inRun
         If values[i] is different from the preceding value
             Print ).
             inRun = false.
     If not inRun
         If values[i] is the same as the following value
             Print (.
             inRun = true.
     Print values[i].
If inRun, print ).*/

import java.util.Random;

public class P6_12 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] dieTosses = new int[20];
        for (int i = 0; i < dieTosses.length; i++) {
            dieTosses[i] = random.nextInt(6) + 1;
        }

        System.out.println("Runs in die tosses: ");
        runs(dieTosses);
    }

    public static void runs(int[] dieTosses) {
        boolean inRun = false;
        int previousValue = dieTosses[0];

        for (int i = 0; i < dieTosses.length - 1; i++) {
            if (inRun) {
                if (dieTosses[i] != previousValue) {
                    System.out.print(") ");
                    inRun = false;
                }
            } else if (!inRun) {
                if (dieTosses[i] == dieTosses[i + 1]) {
                    System.out.print("(");
                    inRun = true;
                } else {
                    System.out.print(" ");
                }
            }

            previousValue = dieTosses[i];
            System.out.print(dieTosses[i] + " ");
        }

        if (inRun && dieTosses[dieTosses.length - 1] == previousValue) {
            System.out.print(" " + dieTosses[dieTosses.length - 1] + ") ");
        } else if (inRun && dieTosses[dieTosses.length - 1] != previousValue) {
            System.out.print(") " + dieTosses[dieTosses.length - 1]);
        } else {
            System.out.print(" " + dieTosses[dieTosses.length - 1]);
        }
    }
}