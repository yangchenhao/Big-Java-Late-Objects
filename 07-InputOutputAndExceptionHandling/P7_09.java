/*Write a program that reads each line in a file, reverses its lines, and writes them to
another file. For example, if the file input.txt contains the lines

Mary had a little lamb
Its fleece was white as snow
And everywhere that Mary went
The lamb was sure to go.

and you run
reverse input.txt output.txt
then output.txt contains

The lamb was sure to go.
And everywhere that Mary went
Its fleece was white as snow
Mary had a little lamb*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class P7_09 {
    public static void main(String[] args) throws FileNotFoundException {
        String fileForReading = args[0];
        String fileForWriting = args[1];

        ArrayList<String> content = getContentFromFile(fileForReading);
        writeContentToFile(fileForWriting, content);
    }

    public static void writeContentToFile(String filename, ArrayList<String> content) throws FileNotFoundException {
        File file = new File(filename);
        PrintWriter out = new PrintWriter(file);

        for (int i = content.size() - 1; i >= 0; i--) {
            String currentLine = content.get(i);
            out.write(currentLine);
        }

        out.close();
    }

    public static ArrayList<String> getContentFromFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner in = new Scanner(file);

        ArrayList<String> fileContent = new ArrayList<String>();
        while (in.hasNextLine()) {
            String currentLine = in.nextLine();
            fileContent.add(currentLine);
        }
        in.close();

        return fileContent;
    }
}