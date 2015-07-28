/*Repeat Exercise P7.2, but allow the user to specify the file name on the command-
line. If the user doesn’t specify any file name, then prompt the user for the name.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class P7_03 {
    public static void main(String[] args) {
        File fileReading = new File(args[0]);
        Scanner in = null;
        File fileWriting = new File(args[1]);
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