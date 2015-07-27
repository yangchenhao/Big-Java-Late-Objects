/*Implement the following algorithm to construct magic n × n squares; it works only if
n is odd.
    Set row = n - 1, column = n / 2.
    For k = 1 ... n * n
         Place k at [row][column].
         Increment row and column.
         If the row or column is n, replace it with 0.
         If the element at [row][column] has already been filled
             Set row and column to their previous values.
             Decrement row.
      
 Write a program whose input is the number n and whose output is the magic square
 of order n if n is odd.*/

import java.util.Scanner;

public class P6_19 {
    public static void main(String[] args) {
        System.out.println("Enter an odd number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();

        int[][] square = makeMagicSquare(number);
        printMagicSquare(square);
    }

    public static int[][] makeMagicSquare(int number) {
        int[][] matrix = new int[number][number];
        int row = number - 1;
        int col = number / 2;

        for (int k = 1; k <= number * number; k++) {
            matrix[row][col] = k;
            row = (row + 1) % number;
            col = (col + 1) % number;

            if (matrix[row][col] != 0) {
                col = (col - 1 + number) % number;
                row = (row - 2 + number) % number;
            }
        }

        return matrix;
    }

    public static void printMagicSquare(int[][] square) {
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                System.out.printf("%3d", square[i][j]);
            }

            System.out.println();
        }
    }
}