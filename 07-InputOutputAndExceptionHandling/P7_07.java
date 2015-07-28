/*Write a program that checks the spelling of all words in a file. It should read each
word of a file and check whether it is contained in a word list. A word list is avail­
able on most Linux systems in the file /usr/share/dict/words . (If you don’t have access
to a Linux system, your instructor should be able to get you a copy.) The program
should print out all words that it cannot find in the word list.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class P7_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter name of file: ");
        String filename = input.next();
        input.close();

        ArrayList<String> allWords = wordsInFile(filename);
        ArrayList<String> allDicitionaryWords = wordsInFile("/usr/share/dict/words");

        notFoundWords(allWords, allDicitionaryWords);
    }

    public static void notFoundWords(ArrayList<String> words, ArrayList<String> dictionary) {
        System.out.println("Hey");
        for (String word : words) {
            System.out.println("Hey");
            if (!dictionary.contains(word)) {
                System.out.println(word);
            }
        }
    }

    public static ArrayList<String> wordsInFile(String filename) {
        ArrayList<String> words = new ArrayList<String>();
        File file = new File(filename);
        Scanner in = null;

        try {
            in = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

        while (in.hasNext()) {
            String currentWord = in.next();
            words.add(currentWord);
        }
        in.close();

        return words;
    }
}