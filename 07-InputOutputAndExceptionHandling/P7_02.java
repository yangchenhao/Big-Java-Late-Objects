/*Write a program that reads a file containing text. Read each line and send it to the
 output file, preceded by line numbers. If the input file is

 Mary had a little lamb
 Whose fleece was white as snow.
 And everywhere that Mary went,
 The lamb was sure to go!

 then the program produces the output file
 1  Mary had a little lamb
 2  Whose fleece was white as snow.
 3  And everywhere that Mary went,
 4  The lamb was sure to go!

 The line numbers are enclosed in   delimiters so that the program can be used for
 numbering Java source files.
 Prompt the user for the input and output file names.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class P7_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name of file for reading: ");
        String fileNameReading = input.next();
        System.out.print("Enter name of file for writing: ");
        String fileNameWriting = input.next();
        input.close();

        File fileReading = new File(fileNameReading);
        Scanner in = null;
        File fileWriting = new File(fileNameWriting);
        PrintWriter out = null;

        try {
            in = new Scanner(fileReading);
            out = new PrintWriter(fileWriting);
        } catch (FileNotFoundException e1) {
            System.out.println("Files are not founded!");
        }

        int lineNumber = 1;
        while (in.hasNextLine()) {
            String line = in.nextLine();
            out.write(String.format("/* %d */ %s\n", lineNumber, line));
            lineNumber++;
        }

        out.close();
        in.close();

        System.out.println("File was read and written!");
    }
}