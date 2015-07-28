/*Write a program that asks the user to input a set of floating-point values. When the
user enters a value that is not a number, give the user a second chance to enter the
value. After two chances, quit reading input. Add all correctly specified values and
print the sum when the user is done entering data. Use exception handling to detect
improper inputs.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class P7_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int times = 2;
        int allNumbers = 0;
        double sum = 0;

        while (times > 0) {
            try {
                System.out.print("Enter a number: ");
                double currentNumber = input.nextDouble();
                sum += currentNumber;
                allNumbers++;
            } catch (InputMismatchException e) {
                System.out.println("Enter valid number!");
                times--;
                input.next();
            }
        }

        System.out.printf("Average of all numbers is: %.2f\n", sum / allNumbers);

        input.close();
    }
}