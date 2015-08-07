/*Implement a SubstringGenerator that generates all substrings of a string. For example,
the substrings of the string "rum" are the seven strings
"r", "ru", "rum", "u", "um", "m", ""
Hint: First enumerate all substrings that start with the first character. There are n of
them if the string has length n. Then enumerate the substrings of the string that you
obtain by removing the first character.*/

package tasks;

public class SubstringGenerator {
    public static void generate(String text) {
        generate(text, 0, 0);
    }

    public static void generate(String text, int letterIndex, int wordIndex) {
        if (letterIndex < text.length()) {
            if (wordIndex < text.length()) {
                wordIndex++;
                System.out.println(text.substring(letterIndex, wordIndex));
            } else {
                letterIndex++;
                wordIndex = letterIndex;
            }

            generate(text, letterIndex, wordIndex);
        } else {
            System.out.println("\"\"");
            return;
        }
    }

    public static void main(String[] args) {
        SubstringGenerator.generate("rum");
    }
}