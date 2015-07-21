/*Write programs that read a line of input as a string and print
a.   Only the uppercase letters in the string.
b.   Every second letter of the string.
c.   The string, with all vowels replaced by an underscore.
d.   The number of vowels in the string.
e.   The positions of all vowels in the string.*/

import java.util.Scanner;

public class P4_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String wholeString = input.nextLine();

        int sumUppercaseLetters = 0;
        for (int i = 0; i < wholeString.length(); i++) {
            if ((int) wholeString.charAt(i) >= 65 && (int) wholeString.charAt(i) <= 90) {
                sumUppercaseLetters++;
            }
        }
        System.out.printf("Sum of uppercase letters in \"%s\" is: %d\n", wholeString,
                sumUppercaseLetters);

        System.out.printf("Every second letter of \"%s\": ", wholeString);
        for (int i = 1; i < wholeString.length(); i += 2) {
            System.out.print(wholeString.charAt(i));
        }
        System.out.println();

        System.out.printf("Some of letters may be with underscore: ");
        for (int i = 0; i < wholeString.length(); i++) {
            if (wholeString.charAt(i) == 'a' || wholeString.charAt(i) == 'A' ||
                wholeString.charAt(i) == 'o' || wholeString.charAt(i) == 'O' ||
                wholeString.charAt(i) == 'u' || wholeString.charAt(i) == 'U' ||
                wholeString.charAt(i) == 'e' || wholeString.charAt(i) == 'E' ||
                wholeString.charAt(i) == 'i' || wholeString.charAt(i) == 'I' ||
                wholeString.charAt(i) == 'y' || wholeString.charAt(i) == 'Y') {

                System.out.print("_");
            }
            else {
                System.out.print(wholeString.charAt(i));
            }
        }
        System.out.println();

        int sumOfVowels = 0;
        for (int i = 0; i < wholeString.length(); i++) {
            if (wholeString.charAt(i) == 'a' || wholeString.charAt(i) == 'A' ||
                wholeString.charAt(i) == 'o' || wholeString.charAt(i) == 'O' ||
                wholeString.charAt(i) == 'u' || wholeString.charAt(i) == 'U' ||
                wholeString.charAt(i) == 'e' || wholeString.charAt(i) == 'E' ||
                wholeString.charAt(i) == 'i' || wholeString.charAt(i) == 'I' ||
                wholeString.charAt(i) == 'y' || wholeString.charAt(i) == 'Y') {
                sumOfVowels++;
            }
        }
        System.out.printf("Sum of vowels in string are: %d\n", sumOfVowels);

        System.out.printf("Positions of all vowels in string are: ");
        for (int i = 0; i < wholeString.length(); i++) {
            if (wholeString.charAt(i) == 'a' || wholeString.charAt(i) == 'A' ||
                wholeString.charAt(i) == 'o' || wholeString.charAt(i) == 'O' ||
                wholeString.charAt(i) == 'u' || wholeString.charAt(i) == 'U' ||
                wholeString.charAt(i) == 'e' || wholeString.charAt(i) == 'E' ||
                wholeString.charAt(i) == 'i' || wholeString.charAt(i) == 'I' ||
                wholeString.charAt(i) == 'y' || wholeString.charAt(i) == 'Y') {
                System.out.print(i + " ");
            }
        }

        input.close();
    }
}