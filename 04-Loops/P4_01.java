/*Write programs with loops that compute
a.   The sum of all even numbers between 2 and 100 (inclusive).
b.   The sum of all squares between 1 and 100 (inclusive).
c.   All powers of 2 from 2 0 up to 2 20 .
d.   The sum of all odd numbers between a and b (inclusive), where a and b are inputs.
e.   The sum of all odd digits of an input. (For example, if the input is 32677, the
sum would be 3 + 7 + 7 = 17.)*/

import java.util.Scanner;

public class P4_01 {
    public static void main(String[] args) {
        int sumEvenNumbers = 0;
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                sumEvenNumbers += i;
            }
        }
        System.out.printf("Sum of all even numbers from 2 to 100 is: %d\n", sumEvenNumbers);

        double sumSquares = 0;
        for (int i = 1; i <= 100; i++) {
            sumSquares += Math.sqrt(i);
        }
        System.out.printf("Sum of all squares from 1 to 100 is: %.2f\n", sumSquares);

        for (int i = 0; i <= 20; i++) {
            System.out.printf("2 to %d = %.2f\n", i, Math.pow(2, i));
        }

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int sumOddNumbers = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 1) {
                sumOddNumbers += i;
            }
        }
        System.out.printf("Sum of all even numbers from a to b is: %d\n", sumOddNumbers);

        int number = input.nextInt();
        int sumOfOddDigits = 0;
        while (number > 0) {
            int remainder = number % 10;
            if (remainder % 2 == 1) {
                sumOfOddDigits += remainder;
            }
            number = number / 10;
        }
        System.out.printf("Sum of all odd digits in %d is: %d\n", number, sumOfOddDigits);
        input.close();
    }
}