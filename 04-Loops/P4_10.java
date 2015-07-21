/*Write a program that reads a word and prints the number of vowels in the word. For
this exercise, assume that a e i o u y are vowels. For example, if the user pro­vides the
input "Harry", the program prints 2 vowels .*/

import java.util.Scanner;

public class P4_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        input.close();
        
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'o' || word.charAt(i) == 'e'||
                word.charAt(i) == 'u' || word.charAt(i) == 'i' || word.charAt(i) == 'y') {
                System.out.print(word.charAt(i) + " ");
            }
        }
    }
}