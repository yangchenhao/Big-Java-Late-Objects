/*
Write a program that reads a number between 1,000 and 999,999 from the user and
prints it with a comma separating the thousands. Here is a sample dialog; the user
input is in color:
Please enter an integer between 1000 and 999999: 23456
23,456
*/

import java.util.Scanner;

public class P2_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String integer = in.nextLine();

        String leftPart = integer.substring(0, integer.length() - 3);
        String rightPart = integer.substring(integer.length() - 3);

        System.out.println(leftPart + "," + rightPart);

        in.close();
    }
}