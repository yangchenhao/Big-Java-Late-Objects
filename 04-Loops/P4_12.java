/*Write a program that reads a word and prints all substrings, sorted by length. For
example, if the user provides the input "rum" , the program prints
r
u
m
ru
um
rum
 */

import java.util.Scanner;

public class P4_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        input.close();
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length() - i; j++) {
                System.out.println(word.substring(j, j + i + 1));
            }
        }
    }
}