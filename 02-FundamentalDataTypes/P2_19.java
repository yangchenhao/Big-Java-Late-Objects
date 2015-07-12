/*
Write a program that transforms numbers 1 , 2 , 3 , ..., 12
into the corresponding month names January , February ,
March , ..., December . Hint: Make a very long string "January
February March ..." , in which you add spaces such that each
month name has the same length. Then use sub­string to
extract the month you want.
*/

import java.util.Scanner;

public class P2_19 {
    public static void main(String[] args) {
        final int charactersInMostLongMonth = 9;

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        String months = "January  February March    April    May      June     July     August   SeptemberOctober  November December ";
        int leftBorder = (number - 1) * charactersInMostLongMonth;
        int rightBorder = (number - 1) * charactersInMostLongMonth + 9;
        String yourMonth = months.substring(leftBorder, rightBorder);

        System.out.println("Your month is: " + yourMonth);

        in.close();
    }
}