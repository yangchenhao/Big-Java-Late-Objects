/*Write programs that read a sequence of integer inputs and print
a.   The smallest and largest of the inputs.
b.   The number of even and odd inputs.
c.   Cumulative totals. For example, if the input is 1 7 2 9, the program should print 1 8 10 19.
d.   All adjacent duplicates. For example, if the input is 1 3 3 4 5 5 6 6 6 2, the
program should print 3 5 6.*/

import java.util.Scanner;

public class P4_02D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String adjacentDuplicates = "";

        int previousNumber = input.nextInt();
        boolean isMarked = false;

        while (input.hasNextInt()) {
            int newNumber = input.nextInt();
            if (newNumber != previousNumber) {
                isMarked = false;
            }

            if (previousNumber == newNumber && !isMarked) {
                adjacentDuplicates = adjacentDuplicates + " " + newNumber;
                isMarked = true;
            }

            previousNumber = newNumber;
        }

        if (adjacentDuplicates != "") {
            System.out.printf("Adjacent numbers are: %s", adjacentDuplicates);
        }
        else {
            System.out.println("There aren't adjacent duplicates!");
        }

        input.close();
    }
}