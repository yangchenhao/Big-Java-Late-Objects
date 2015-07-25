/*It is a well-known phenomenon that most people are easily able to read a text whose
words have two characters flipped, provided the first and last letter of each word are 
not changed. For example,
I dn’ot gvie a dman for a man taht can olny sepll a wrod one way. (Mrak Taiwn)
Write a method String scramble(String word) that constructs a scrambled version of a
given word, ran­domly flipping two characters other than the first and last one. Then
write a program that reads words and prints the scrambled words.*/

import java.util.Random;
import java.util.Scanner;

public class P5_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter words: ");

        while (!input.hasNext("EXIT!")) {
            String word = input.next();
            System.out.println(scramble(word));
        }

        input.close();
    }

    public static String scramble(String word) {
        if (word.length() > 3) {
            Random random = new Random();
            int firstIndex = random.nextInt(word.length() - 1) + 1;
            int secondIndex = random.nextInt(word.length() - 1) + 1;

            if (firstIndex == secondIndex) {
                while (firstIndex == secondIndex) {
                    secondIndex = random.nextInt(word.length() - 1) + 1;
                }
            }

            if (firstIndex > secondIndex) {
                return word.substring(0, secondIndex) +
                       word.charAt(firstIndex) +
                       word.substring(secondIndex + 1, firstIndex) +
                       word.charAt(secondIndex) +
                       word.substring(firstIndex + 1);
            } else {
                return word.substring(0, firstIndex) +
                       word.charAt(secondIndex) +
                       word.substring(firstIndex + 1, secondIndex) +
                       word.charAt(firstIndex) +
                       word.substring(secondIndex + 1);
            }
        } else {
            return word;
        }
    }
}