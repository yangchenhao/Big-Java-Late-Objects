/*Write a program that converts a Roman number such as MCMLXXVIII to its decimal number
 representation. Hint: First write a method that yields the numeric value of each
 of the letters. Then use the following algorithm:
 total = 0
 While the roman number string is not empty
 If value(first character) is at least value(second character), or the string has length 1
 Add value(first character) to total.
 Remove the character.
 Else
 Add the difference value(second character) - value(first character) to total.
 Remove both characters.*/

import java.util.Scanner;

public class P5_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter roman number: ");
        String romanNumber = input.next();
        input.close();

        int total = 0;
        while (!romanNumber.equals("")) {
            char firstLetter = romanNumber.charAt(0);
            char secondLetter = '\u0000';

            if (romanNumber.length() > 1) {
                secondLetter = romanNumber.charAt(1);
            }

            if (romanNumber.length() == 1 ||
                romanToDigit(firstLetter) <= romanToDigit(secondLetter)) {
                total += romanToDigit(firstLetter);
                romanNumber = romanNumber.substring(1);
            } else {
                total += (romanToDigit(secondLetter) - romanToDigit(firstLetter));
                romanNumber = romanNumber.substring(2);
            }
        }

        System.out.printf("Number is: %d", total);
    }

    public static int romanToDigit(char letter) {
        if (letter == 'I') {
            return 1;
        } else if (letter == 'V') {
            return 5;
        } else if (letter == 'X') {
            return 10;
        } else if (letter == 'L') {
            return 50;
        } else if (letter == 'C') {
            return 100;
        } else if (letter == 'D') {
            return 500;
        } else if (letter == 'M') {
            return 1000;
        } else {
            return 0;
        }
    }
}