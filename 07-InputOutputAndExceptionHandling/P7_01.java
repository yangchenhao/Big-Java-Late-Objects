/*Write a program that carries out the following tasks:
 Open a file with the name hello.txt.
 Store the message “Hello, World!” in the file.
 Close the file.
 Open the same file again.
 Read the message into a string variable and print it.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class P7_01 {
    public static void main(String[] args) {
        writeInFile();
        String content = readFromFile("hello.txt");

        System.out.println(content);
    }

    public static String readFromFile(String filename) {
        File file = new File(filename);
        String content = null;

        try (Scanner input = new Scanner(file)) {
            content = input.nextLine();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

        return content;

    }

    public static void writeInFile() {
        File file = new File("hello.txt");

        try (PrintWriter out = new PrintWriter(file)) {
            out.write("Hello, World!");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}