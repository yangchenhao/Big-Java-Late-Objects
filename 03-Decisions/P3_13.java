/*Write a program that translates a number between 0 and 4 into the closest letter
grade. For example, the number 2.8 (which might have been the average of several
grades) would be converted to B–. Break ties in favor of the better grade; for exam­ple
2.85 should be a B.*/

import java.util.Scanner;

public class P3_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double mark = in.nextDouble();
        in.close();

        String grade = null;

        if (mark < 0 || mark > 4) {
            System.out.println("Mark is outside the boundaries!");
            return;
        }
        else if (mark >= 3.85) {
            grade = "A";
        }
        else if (mark >= 3.7) {
            grade = "A-";
        }
        else if (mark >= 3.0) {
            grade = "B+";
        }
        else if (mark >= 2.85) {
            grade = "B";
        }
        else if (mark >= 2.7) {
            grade = "B-";
        }
        else if (mark >= 2.0) {
            grade = "C+";
        }
        else if (mark >= 1.85) {
            grade = "C";
        }
        else if (mark >= 1.7) {
            grade = "C-";
        }
        else if (mark >= 1.0) {
            grade = "D+";
        }
        else if (mark > 0.85) {
            grade = "D";
        }
        else if (mark > 0.7) {
            grade = "D-";
        }
        else {
            grade = "F";
        }

        System.out.printf("Grade of student is %s", grade);

        in.close();
    }
}