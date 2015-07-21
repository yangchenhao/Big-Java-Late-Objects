/*Write a program that reads an integer and displays, using asterisks, a filled diamond
of the given side length. For example, if the side length is 4, the program should dis­play
     *
    ***
   *****
  *******
   *****
    ***
     *
 */

import java.util.Scanner;

public class P4_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();

        for (int i = 0; i < number - 1; i++) {
            for (int j = 0; j < number * 2 - 1; j++) {
                if ((j < number - 1 && i + j < number - 1) || (j > number - 1 && j - i >= number)) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < number * 2 - 1; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = number; i < number * 2 - 1; i++) {
            for (int j = 0; j < number * 2 - 1; j++) {
                if ((j == number - 1) || (j < number - 1 && i - j < number) ||
                    (j > number - 1 && i + j < number * 2 + (number - 2))) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}