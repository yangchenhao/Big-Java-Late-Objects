/*Using the mechanism described in Special Topic 7.1, write a program that reads all
data from a web page and writes them to a file. Prompt the user for the web page
URL and the file.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class P7_14 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter file to write content: ");
        String filename = input.nextLine();
        System.out.print("Please enter webpage to get html from it: ");
        String webpage = input.nextLine();
        input.close();

        String webHTML = getHTMLFromWebpage(webpage);
        writeContentInFile(filename, webHTML);
    }

    public static void writeContentInFile(String filename, String content) throws FileNotFoundException {
        File file = new File(filename);
        PrintWriter out = new PrintWriter(file);
        out.write(content);
        out.close();
        System.out.println("Information was saved in the file!");
    }

    public static String getHTMLFromWebpage(String webpage) throws IOException {
        Document doc = Jsoup.connect(webpage).userAgent("Mozilla").get();
        String webpageHTML = doc.html();

        return webpageHTML;
    }
}