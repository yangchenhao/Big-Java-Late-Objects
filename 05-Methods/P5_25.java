/*Postal bar codes. For faster sorting of letters, the United States Postal Service encourages
companies that send large volumes of mail to use a bar code denoting the zip code (see Figure 6).
The encoding scheme for a five-digit zip code is shown in Figure 7. There are
full-height frame bars on each side. The five encoded digits are followed by a check
digit, which is computed as follows: Add up all digits, and choose the check digit to
make the sum a multiple of 10. For example, the zip code 95014 has a sum of 19, so
the check digit is 1 to make the sum equal to 20. Each digit of the zip code, and the check digit, is encoded.
The digit can be easily computed from the bar code using the column weights 7, 4, 2,
1, 0. For example, 01100 is 0 × 7 + 1 × 4 + 1 × 2 + 0 × 1 + 0 × 0 = 6. The only exception
is 0, which would yield 11 according to the weight formula.
Write a program that asks the user for a zip code and prints the bar code. Use : for
half bars, | for full bars. For example, 95014 becomes
    ||:|:::|:|:||::::::||:|::|:::|||
Provide these methods:
    public static void printDigit(int d)
    public static void printBarCode(int zipCode)*/

import java.util.Scanner;

public class P5_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter zip code: ");
        int zipCode = input.nextInt();
        while (zipCode < 10000) {
            System.out.print("Please enter again the zip code(5 digits): ");
            zipCode = input.nextInt();
        }
        input.close();

        printBarCode(zipCode);
    }

    public static int checkDigit(int zipCode) {
        int sum = 0;

        while (zipCode > 0) {
            int remainder = zipCode % 10;
            zipCode = zipCode / 10;
            sum += remainder;
        }

        return 10 - (sum % 10);
    }

    public static void printBarCode(int zipCode) {
        int copyZipCode = zipCode;
        System.out.print("|");
        int divisor = 10000;

        for (int i = 0; i < 5; i++) {
            int currentDigit = copyZipCode / divisor;
            printDigit(currentDigit);
            copyZipCode = copyZipCode % divisor;
            divisor = divisor / 10;
        }

        int checkDigit = checkDigit(zipCode);
        printDigit(checkDigit);
        System.out.print("|");
    }

    public static void printDigit(int d) {
        if (d == 0) {
            System.out.print("||:::");
        } else if (d == 1) {
            System.out.print(":::||");
        } else if (d == 2) {
            System.out.print("::|:|");
        } else if (d == 3) {
            System.out.print("::|:|");
        } else if (d == 4) {
            System.out.print(":|::|");
        } else if (d == 5) {
            System.out.print(":|:|:");
        } else if (d == 6) {
            System.out.print(":||::");
        } else if (d == 7) {
            System.out.print("|:::|");
        } else if (d == 8) {
            System.out.print("|::|:");
        } else if (d == 9) {
            System.out.print("|:|::");
        }
    }
}