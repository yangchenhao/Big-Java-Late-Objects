/*Write a program that reads a word and prints each character of the word on a sepa­rate line.
For example, if the user provides the input "Harry" , the program prints
H
a
r
r
y
*/

import java.util.Scanner;

public class P4_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.next();

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }

        input.close();
    }
}