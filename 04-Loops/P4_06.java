/*Translate the following pseudocode for finding the minimum value from a set of inputs into a Java program.
Set a Boolean variable "first" to true.
While another value has been read successfully
     If first is true
         Set the minimum to the value.
         Set first to false.
     Else if the value is less than the minimum
         Set the minimum to the value.
Print the minimum.*/

import java.util.Scanner;

public class P4_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean first = true;
        double minimum = Double.MAX_VALUE;
        while (input.hasNextDouble()) {
            double newDouble = input.nextDouble();
            if (first) {
                minimum = newDouble;
                first = false;
            }
            else if (newDouble < minimum) {
                minimum = newDouble;
            }
        }

        System.out.printf("Minimum values is %.2f", minimum);
        input.close();
    }
}