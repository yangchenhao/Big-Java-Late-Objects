/*
The following pseudocode describes how to turn a string containing a ten-digit
phone number (such as "4155551212" ) into a more readable string with parentheses
and dashes, like this: "(415) 555-1212" .
Take the substring consisting of the first three characters and surround it with "(" and ") ". This is the
area code.
Concatenate the area code, the substring consisting of the next three characters, a hyphen, and the
substring consisting of the last four characters. This is the formatted number.
Translate this pseudocode into a Java program that reads a telephone number into a
string variable, com­putes the formatted number, and prints it.
*/

import java.util.Scanner;

public class P2_23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String number = in.next();

        String firstThree = number.substring(0, 3);
        String secondThree = number.substring(3, 6);
        String lastPart = number.substring(6);

        System.out.printf("Telephone number is: (%s) %s-%s", firstThree, secondThree, lastPart);

        in.close();
    }
}