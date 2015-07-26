/*Write a program that reads in a bar code (with : denoting half bars and | denoting full bars)
and prints out the zip code it represents. Print an error message if the bar
code is not correct.*/

import java.util.Scanner;

public class P5_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String barCode = input.next();
        input.close();

        int currentZipCode = getZipCode(barCode);
        System.out.println(currentZipCode);
    }

    public static int getZipCode(String barCode) {
        int start = 1;
        String digits = "";

        while (start < 26) {
            String currentBars = barCode.substring(start, start + 5);
            digits += digit(currentBars);
            start += 5;
        }

        return Integer.parseInt(digits);
    }

    public static int digit(String bars) {
        if (bars.equals("||:::")) {
            return 0;
        } else if (bars.equals(":::||")) {
            return 1;
        } else if (bars.equals("::|:|")) {
            return 2;
        } else if (bars.equals("::|:|")) {
            return 3;
        } else if (bars.equals(":|::|")) {
            return 4;
        } else if (bars.equals(":|:|:")) {
            return 5;
        } else if (bars.equals(":||::")) {
            return 6;
        } else if (bars.equals("|:::|")) {
            return 7;
        } else if (bars.equals("|::|:")) {
            return 8;
        } else if (bars.equals("|:|::")) {
            return 9;
        } else {
            return -1;
        }
    }
}