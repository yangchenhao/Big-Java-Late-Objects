/*Write a program that asks the user for a file name and prints the number of charac­ters,
words, and lines in that file.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P7_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter file name: ");
        String fileName = input.next();
        input.close();

        File file = new File(fileName);
        Scanner in = null;

        try {
            in = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File was not found!");
        }

        int numberOfLines = 0;
        int numberOfWords = 0;
        int numberOfCharacters = 0;
        while (in.hasNextLine()) {
            String line = in.nextLine();
            String[] words = line.split("\\s+");

            numberOfLines += 1;
            numberOfCharacters += line.length();
            numberOfWords = words.length;
        }

        in.close();

        System.out.printf("Number of lines are: %d\n", numberOfLines);
        System.out.printf("Number of words are: %d\n", numberOfWords);
        System.out.printf("Number of characters are: %d\n", numberOfCharacters);
    }
}