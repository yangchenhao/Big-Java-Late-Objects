/*Using the mechanism described in Special Topic 7.1, write a program that reads all
 data from a web page and prints all hyperlinks of the form
 <a href=" link "> link text </a>*/

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class P7_15 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter webpage to get links from html it: ");
        String webpage = input.nextLine();
        input.close();

        getHTMLLinksFromPage(webpage);
    }

    public static ArrayList<String> getHTMLLinksFromPage(String webpage) throws IOException {
        ArrayList<String> links = new ArrayList<String>();

        Document doc = Jsoup.connect(webpage).userAgent("Mozilla").get();
        Elements allTags = doc.getElementsByTag("a");

        for (Element tag : allTags) {
            links.add(tag.toString());
        }

        return links;
    }
}