/*
Write a program that reads a number between 1,000 and 999,999 from the user,
where the user enters a comma in the input. Then print the number without a
comma. Here is a sample dialog; the user input is in color:
Please enter an integer between 1,000 and 999,999: 23,456
23456
Hint: Read the input as a string. Measure the length of the string. Suppose it contains
n characters. Then extract substrings consisting of the first n – 4 characters and the
last three characters.
*/

import java.util.Scanner;

public class P2_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter an integer between 1,000 and 999,999: ");
        String integer = in.nextLine();

        String leftPart = integer.substring(0, integer.length() - 4);
        String rightPart = integer.substring(integer.length() - 3);

        System.out.println(leftPart + rightPart);

        in.close();
    }
}