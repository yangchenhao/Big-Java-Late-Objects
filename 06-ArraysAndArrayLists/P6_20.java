/*Write a method that computes the average of the neighbors of a two-dimensional
array element in the eight directions shown in Figure 14.
public static double neighborAverage(int[][] values, int row, int column)
However, if the element is located at the boundary of the array, only include the
neighbors that are in the array. For example, if row and column are both 0, there are
only three neighbors.*/

import java.util.Scanner;

public class P6_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Please enter number of columns: ");
        int cols = input.nextInt();

        int[][] values = new int[rows][cols];
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                System.out.printf("Please enter [%d][%d]: ", i, j);
                values[i][j] = input.nextInt();
            }
        }

        System.out.print("Please enter a row: ");
        int choosenRow = input.nextInt();
        System.out.println("Please enter a column: ");
        int choosenCol = input.nextInt();
        input.close();

        double sum = neighborAverage(values, choosenRow, choosenCol);
        System.out.printf("Sum is: %.2f", sum);
    }

    public static double neighborAverage(int[][] values, int row, int col) {
        double sum = 0;

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if (Math.abs(row - i) <= 1 && row != i && 
                    Math.abs(col - j) <= 1 && col != j) {
                    sum += values[i][j];
                }
            }
        }

        return sum;
    }
}