/*Prime numbers. Write a program that prompts the user for an integer and then prints
out all prime numbers up to that integer. For example, when the user enters 20, the
program should print
2
3
5
7
11
13
17
19
Recall that a number is a prime number if it is not divisible by any number except 1
and itself.*/

import java.util.Scanner;

public class P4_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();

        boolean isPrime = true;
        for (int i = 2; i <= number; i++) {
            int currentNumber = i;
            for (int j = 2; j < currentNumber; j++) {
                if (currentNumber % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(currentNumber);
            }

            isPrime = true;
        }
    }
}