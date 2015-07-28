/*Write a program Find that searches all files specified on the command line and prints
out all lines containing a specified word. For example, if you call
java Find ring report.txt address.txt Homework.java
then the program might print
report.txt: has broken up an international ring of DVD bootleggers that
address.txt: Kris Kringle, North Pole
address.txt: Homer Simpson, Springfield
Homework.java: String filename;
The specified word is always the first command line argument.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P7_06 {
    public static void main(String[] args) {
        String word = args[0];

        for (int i = 1; i < args.length; i++) {
            File file = new File(args[i]);
            Scanner in = null;

            try {
                in = new Scanner(file);
            } catch (FileNotFoundException e) {
                System.out.println("File was not found!");
            }

            while (in.hasNextLine()) {
                String line = in.nextLine();
                if (line.contains(word)) {
                    System.out.printf("%s: %s\n", args[i], line);
                }
            }

            in.close();
        }
    }
}