/*Write a program that replaces each line of a file with its reverse. For example, if you
 run
 java Reverse HelloPrinter.java
 then the contents of HelloPrinter.java are changed to
 retnirPolleH ssalc cilbup
 {
 )sgra ][gnirtS(niam diov citats cilbup
 {
 wodniw elosnoc eht ni gniteerg a yalpsiD //
 ;)"!dlroW ,olleH"(nltnirp.tuo.metsyS
 }
 }*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P7_08 {
    public static void main(String[] args) {
        String filename = args[0];
        readFile(filename);
    }

    public static void readFile(String filename) {
        File file = new File(filename);
        Scanner in = null;

        try {
            in = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

        while (in.hasNextLine()) {
            String currentLine = in.nextLine();
            System.out.println(reverse(currentLine));
        }
        in.close();
    }

    public static String reverse(String line) {
        String newLine = "";

        for (int i = line.length() - 1; i >= 0; i--) {
            newLine += line.charAt(i);
        }

        return newLine;
    }
}