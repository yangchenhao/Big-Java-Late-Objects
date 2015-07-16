/*Roman numbers. Write a program that converts a positive integer into the Roman
 number system. The Roman number system has digits
     I 1
     V 5
     X 10
     L 50
     C 100
     D 500
     M 1,000
 Numbers are formed according to the following rules:
     a.  Only numbers up to 3,999 are represented.
     b.  As in the decimal system, the thousands, hundreds, tens, and ones are ex­
     pressed separately.
     c.  The numbers 1 to 9 are expressed as
         I  1
         II  2
         III  3
         IV  4
         V  5
         VI  6
         VII  7
         VIII  8
         IX  9
         As you can see, an I preceding a V or X is subtracted from the value, and you
         can never have more than three I’s in a row.
     d.  Tens and hundreds are done the same way, except that the letters X, L, C and C,
         D, M are used instead of I, V, X, respectively.
 Your program should take an input, such as 1978, and convert it to Roman numerals,
 MCMLXXVIII.*/

import java.util.Scanner;

public class P3_26 {
    public static void main(String[] args) {
        System.out.print("Please enter positive integer: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();

        if (number <= 0 || number >= 3999) {
            System.out.println("You have entered not valid number!");
        }

        String romanNumber = "";

        int digit = number / 1000;
        number = number % 1000;
        if (digit == 1) {
            romanNumber += "M";
        }
        else if (digit == 2) {
            romanNumber += "MM";
        }
        else if (digit == 3) {
            romanNumber += "MMM";
        }

        digit = number / 100;
        number = number % 100;
        if (digit == 1) {
            romanNumber += "C";
        }
        else if (digit == 2) {
            romanNumber += "CC";
        }
        else if (digit == 3) {
            romanNumber += "CCC";
        }
        else if (digit == 4) {
            romanNumber += "CD";
        }
        else if (digit == 5) {
            romanNumber += "D";
        }
        else if (digit == 6) {
            romanNumber += "DC";
        }
        else if (digit == 7) {
            romanNumber += "DCC";
        }
        else if (digit == 8) {
            romanNumber += "DCCC";
        }
        else if (digit == 9) {
            romanNumber += "CM";
        }

        digit = number / 10;
        number = number % 10;
        if (digit == 1) {
            romanNumber += "X";
        }
        else if (digit == 2) {
            romanNumber += "XX";
        }
        else if (digit == 3) {
            romanNumber += "XXX";
        }
        else if (digit == 4) {
            romanNumber += "XL";
        }
        else if (digit == 5) {
            romanNumber += "L";
        }
        else if (digit == 6) {
            romanNumber += "LX";
        }
        else if (digit == 7) {
            romanNumber += "LXX";
        }
        else if (digit == 8) {
            romanNumber += "LXXX";
        }
        else if (digit == 9) {
            romanNumber += "XC";
        }

        digit = number / 1;
        number = number % 1;
        if (digit == 1) {
            romanNumber += "I";
        }
        else if (digit == 2) {
            romanNumber += "II";
        }
        else if (digit == 3) {
            romanNumber += "III";
        }
        else if (digit == 4) {
            romanNumber += "IV";
        }
        else if (digit == 5) {
            romanNumber += "V";
        }
        else if (digit == 6) {
            romanNumber += "VI";
        }
        else if (digit == 7) {
            romanNumber += "VII";
        }
        else if (digit == 8) {
            romanNumber += "VIII";
        }
        else if (digit == 9) {
            romanNumber += "IX";
        }

        System.out.printf("Roman Number is: %s", romanNumber);
    }
}