/*Use recursion to determine the number of digits in an integer n . Hint: If n is < 10, it
has one digit. Otherwise, it has one more digit than n / 10 .*/

import java.util.Scanner;

public class P5_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();
        System.out.println(numberOfDigits(number));
        input.close();
    }

    public static int numberOfDigits(int number) {
        if (number >= 10) {
            return numberOfDigits(number / 10) + 1;
        } else {
            return 1;
        }
    }
}