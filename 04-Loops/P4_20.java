/*Write a program that reads an integer and displays, using asterisks, a filled and hollow square,
placed next to each other. For example if the side length is 5, the program should display
 *****   *****
 *****   *   *
 *****   *   *
 *****   *   *
 *****   *****
 */

import java.util.Scanner;

public class P4_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number * 2 + 1; j++) {
                if (j == number || (i > 0 && i < number - 1 && j > number + 1 && j < number * 2)) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}