/*Write a program that translates a letter grade into a number grade. Letter grades are
A, B, C, D, and F, possibly followed by + or –. Their numeric values are 4, 3, 2, 1, and
0. There is no F+ or F–. A + increases the numeric value by 0.3, a – decreases it by 0.3.
However, an A+ has value 4.0.
Enter a letter grade: B-
The numeric value is 2.7.*/

import java.util.Scanner;

public class P3_12 {
    public static void main(String[] args) {
        final double gradeA = 4.0;
        final double gradeB = 3.0;
        final double gradeC = 2.0;
        final double gradeD = 1.0;
        final double gradeF = 0.0;

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a value grade: ");
        String grade = in.next();

        double addition = 0;
        if (grade.charAt(1) == '+') {
            addition += 0.3;
        }
        else if (grade.charAt(1) == '-') {
            addition -= 0.3;
        }

        double result = 0;
        if (grade.charAt(0) == 'A') {
            if (addition < 0) {
                result += gradeA + addition;
            }
            else if (addition > 0) {
                result += gradeA;
            }
        }
        else if (grade.charAt(0) == 'B') {
            result += gradeB + addition;
        }
        else if (grade.charAt(0) == 'C') {
            result += gradeC + addition;
        }
        else if (grade.charAt(0) == 'D') {
            result += gradeD + addition;
        }
        else if (grade.charAt(0) == 'F') {
            if (addition > 0) {
                result += gradeF + addition;
            }
            else if (addition < 0) {
                result += gradeF;
            }
        }

        System.out.printf("The numeric value is %.1f", result);

        in.close();
    }
}