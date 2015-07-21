/*Factoring of integers. Write a program that asks the user for an integer and then
prints out all its factors. For example, when the user enters 150, the program should
print
2
3
5
5
*/

import java.util.Scanner;

public class P4_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();
        input.close();

        int factor = 2;
        while (number > 1) {
            if (number % factor == 0) {
                System.out.println(factor);
                number = number / factor;
            }
            else {
                factor++;
            }
        }
    }
}