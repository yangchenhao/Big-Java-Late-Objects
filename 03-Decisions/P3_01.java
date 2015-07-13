/*Write a program that reads an integer and prints
whether it is negative, zero, or positive.*/

import java.util.Scanner;

public class P3_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int number = in.nextInt();
        
        if (number > 0) {
            System.out.println("Positive number");
        }
        else if (number < 0) {
            System.out.println("Negative number");
        }
        else {
            System.out.println("Number is equal to zero!");
        }

        in.close();
    }
}