/*Write a program that reads a word and prints the number of syllables in the word.
For this exercise, assume that syllables are determined as follows: Each sequence of
adjacent vowels a e i o u y , except for the last e in a word, is a syllable. However, if
that algorithm yields a count of 0, change it to 1. For example,
Word         Syllables
Harry         2
hairy         2
hare          1
the           1
*/

import java.util.Scanner;

public class P4_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Word: ");
        String word = input.next();
        input.close();

        int numberOfSyllables = 0;
        boolean isSyllable = false;
        for (int i = 0; i < word.length(); i++) {
            char currentCharacter = Character.toLowerCase(word.charAt(i));
            if (currentCharacter == 'a' || currentCharacter == 'o' ||
                currentCharacter == 'u' || currentCharacter == 'i' ||
                currentCharacter == 'y' ||
                (currentCharacter == 'e' && i != word.length() - 1)) {
                if (isSyllable) {
                    isSyllable = false;
                }
                else {
                    numberOfSyllables++;
                    isSyllable = true;
                }
            }
        }

        if (numberOfSyllables == 0) {
            numberOfSyllables = 1;
        }

        System.out.printf("Number of syllables: %d", numberOfSyllables);
    }
}