/*In Exercise P3.26 you were asked to write a program to
convert a number to its rep­resentation in Roman numerals.
At the time, you did not know how to eliminate duplicate
code, and as a consequence the resulting program was rather
long. Rewrite that program by implementing and using the
following method:
public static String romanDigit(int n, String one, String five, String ten)
That method translates one digit, using the strings specified for the one, five, and ten
values. You would call the method as follows:
romanOnes = romanDigit(n % 10, “I”, “V”, “X”);
n = n / 10;
romanTens = romanDigit(n % 10, “X”, “L”, “C”);
. . .*/

import java.util.Scanner;

public class P5_21 {
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
        } else if (digit == 2) {
            romanNumber += "MM";
        } else if (digit == 3) {
            romanNumber += "MMM";
        }

        digit = number / 100;
        number = number % 100;
        romanNumber += romanDigit(digit, "C", "D", "M");

        digit = number / 10;
        number = number % 10;
        romanNumber += romanDigit(digit, "X", "L", "C");

        digit = number / 1;
        number = number % 1;
        romanNumber += romanDigit(digit, "I", "V", "X");

        System.out.println(romanNumber);
    }

    public static String romanDigit(int n, String one, String five, String ten) {
        if (n == 1) {
            return one;
        } else if (n == 2) {
            return one + one;
        } else if (n == 3) {
            return one + one;
        } else if (n == 4) {
            return one + five;
        } else if (n == 5) {
            return five;
        } else if (n == 6) {
            return five + one;
        } else if (n == 7) {
            return five + one + one;
        } else if (n == 8) {
            return five + one + one + one;
        } else if (n == 9) {
            return one + ten;
        } else {
            return "";
        }
    }
}