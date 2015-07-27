/*Magic squares. An n × n matrix that is filled with the numbers 1, 2, 3, . . ., n 2 is a
 magic square if the sum of the elements in each row, in each column, and in the two
 diagonals is the same value.
 Write a program that reads in 16 values from the keyboard and tests whether they
 form a magic square when put into a 4 × 4 array. You need to test two features:
 1.   Does each of the numbers 1, 2, ..., 16 occur in the user input?
 2.   When the numbers are put into a square, are the sums of the rows, columns,
 and diagonals equal to each other?*/

import java.util.Scanner;

public class P6_18 {
    public static final int N = 4;

    public static void main(String[] args) {
        boolean isValid = validMagicSquare(readSquare());

        if (isValid) {
            System.out.println("Matrix is valid!");
        } else {
            System.out.println("Matrix is not valid!");
        }
    }

    public static boolean validMagicSquare(int[][] square) {
        if (!correctNumbers(square)) {
            return false;
        }

        int mainDiagonal = mainDiagonalSum(square);
        int antiDiagonal = antiDiagonalSum(square);

        for (int i = 0; i < N; i++) {
            if (mainDiagonal != columnSum(square, i) ||
                antiDiagonal != columnSum(square, i)) {
                return false;
            }
        }

        for (int i = 0; i < N; i++) {
            if (mainDiagonal != rowSum(square, i) ||
                antiDiagonal != rowSum(square, i)) {
                return false;
            }
        }

        return true;
    }

    private static int mainDiagonalSum(int[][] square) {
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += square[i][i];
        }

        return sum;
    }

    private static int antiDiagonalSum(int[][] square) {
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += square[i][N - i - 1];
        }

        return sum;
    }

    private static int columnSum(int[][] square, int columnNumber) {
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += square[i][columnNumber];
        }

        return sum;
    }

    private static int rowSum(int[][] square, int rowNumber) {
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += square[rowNumber][i];
        }

        return sum;
    }

    private static boolean correctNumbers(int[][] square) {
        boolean[] seenNumber = new boolean[N * N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int number = square[i][j];
                if (number < 1 || number > (N * N) || seenNumber[number - 1]) {
                    return false;
                } else {
                    seenNumber[number - 1] = true;
                }
            }
        }

        return true;
    }

    private static int[][] readSquare() {
        int square[][] = new int[N][N];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int number = input.nextInt();
                square[i][j] = number;
            }
        }

        input.close();
        return square;
    }
}