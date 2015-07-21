/*Write a program that reads a number and prints all of its binary digits: Print the
remainder number % 2 , then replace the number with number / 2 . Keep going until the
number is 0. For example, if the user provides the input 13, the output should be
1
0
1
1
*/

import java.util.Scanner;

public class P4_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();

        while (number > 0) {
            int remainder = number % 2;
            System.out.println(remainder);
            number = number / 2;
        }
    }
}