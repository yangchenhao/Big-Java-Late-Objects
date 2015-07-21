/*The Fibonacci numbers are defined by the sequence
f 1 = 1
f 2 = 1
f n = f n − 1 + f n − 2
Reformulate that as
Fibonacci numbers describe the
growth of a rabbit population.
fold1 = 1;
fold2 = 1;
fnew = fold1 + fold2;
After that, discard fold2 , which is no longer needed, and set fold2 to fold1 and fold1 to
fnew . Repeat an appropriate number of times.
Implement a program that prompts the user for an integer n and prints the nth
Fibonacci number, using the above algorithm.*/

import java.util.Scanner;

public class P4_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number > 2) {
            int firstNumber = 1;
            int secondNumber = 1;
            int newNumber = 0;
            for (int i = 0; i < number - 2; i++) {
                newNumber = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = newNumber;
            }
            System.out.printf("%d number is: %d", number, newNumber);
        }
        else {
            System.out.printf("%d number is: %d", number, 1);
        }

        input.close();
    }
}