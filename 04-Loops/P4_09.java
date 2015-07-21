/*Write a program that reads a word and prints the word in reverse. For example, if the
user provides the input "Harry" , the program prints
yrraH
*/

import java.util.Scanner;

public class P4_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.next();
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }

        input.close();
    }
}