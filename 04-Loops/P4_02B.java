/*Write programs that read a sequence of integer inputs and print
a.   The smallest and largest of the inputs.
b.   The number of even and odd inputs.
c.   Cumulative totals. For example, if the input is 1 7 2 9, the program should print 1 8 10 19.
d.   All adjacent duplicates. For example, if the input is 1 3 3 4 5 5 6 6 6 2, the
program should print 3 5 6.*/

import java.util.Scanner;

public class P4_02B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countOfEvenNumbers = 0;
        int countOfOddNumbers = 0;

        while (input.hasNextInt()) {
            int newNumber = input.nextInt();

            if (newNumber % 2 == 0) {
                countOfEvenNumbers++;
            }

            if (newNumber % 2 == 1) {
                countOfOddNumbers++;
            }
        }

        System.out.printf("Count of even numbers is: %d\n", countOfEvenNumbers);
        System.out.printf("Count of odd numbers is: %d\n", countOfOddNumbers);

        input.close();
    }
}