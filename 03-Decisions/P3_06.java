/*Repeat Exercise P3.5, but before reading the numbers, ask the user whether
increas­ing/decreasing should be “strict” or “lenient”. In lenient mode, the sequence 3 4 4 is
increasing and the sequence 4 4 4 is both increasing and decreasing.*/

import java.util.Scanner;

public class P3_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Strict or lenient? ");
        String input = in.next().toLowerCase();

        int first = in.nextInt();
        int second = in.nextInt();
        int third = in.nextInt();

        if (input.equals("strict")) {
            if (first < second && second < third) {
                System.out.println("increasing");
            }
            else if (first > second && second > third) {
                System.out.println("decreasing");
            }
            else {
                System.out.println("neither");
            }
        }
        else if (input.equals("lenient")) {
            if ((first <= second && second < third) || (first < second && second <= third)) {
                System.out.println("increasing");
            }
            else if ((first >= second && second > third) || (first > second && second >= third)) {
                System.out.println("decreasing");
            }
            else if ((first == second) && (second == third)) {
                System.out.println("increasing and decreasing");
            }
            else {
                System.out.println("neither");
            }
        }

        in.close();
    }
}