/*Use recursion to compute a n , where n is a positive integer. Hint: If n is 1, then
n = a. If n is even, then a n = (a n/2 ) 2 . Otherwise, a n = a × a n–1 .*/

import java.util.Scanner;

public class P5_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a: ");
        int a = input.nextInt();
        System.out.println("Please enter n: ");
        int n = input.nextInt();
        input.close();

        System.out.println(compute(a, n));
    }

    public static int compute(int a, int n) {
        if (n == 1) {
            return a;
        } else if (n % 2 == 0) {
            return compute(a, n / 2) * compute(a, n / 2);
        } else {
            return a * compute(a, n - 1);
        }
    }
}