/*Write programs that read a sequence of integer inputs and print
a.   The smallest and largest of the inputs.
b.   The number of even and odd inputs.
c.   Cumulative totals. For example, if the input is 1 7 2 9, the program should print 1 8 10 19.
d.   All adjacent duplicates. For example, if the input is 1 3 3 4 5 5 6 6 6 2, the
program should print 3 5 6.*/

import java.util.Scanner;

public class P4_02A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        while (input.hasNextInt()) {
            int newNumber = input.nextInt();

            if (newNumber > largest) {
                largest = newNumber;
            }

            if (newNumber < smallest) {
                smallest = newNumber;
            }
        }

        System.out.printf("Largest number is: %d\n", largest);
        System.out.printf("Smallest number is: %d\n", smallest);

        input.close();
    }
}