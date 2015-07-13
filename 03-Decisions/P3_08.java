/*Write a program that reads four integers and prints “two pairs” if the input consists
of two matching pairs (in some order) and “not two pairs” otherwise. For example,
1 2 2 1
1 2 2 3
2 2 2 2
two pairs
not two pairs
two pairs*/

import java.util.Scanner;

public class P3_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int first = in.nextInt();
        int second = in.nextInt();
        int third = in.nextInt();
        int fourth = in.nextInt();

        if ((first == second && third == fourth) ||
            (first == third && second == fourth) ||
            (first == fourth && second == third)) {

            System.out.println("Two pairs");
        }
        else {
            System.out.println("Not two pairs");
        }

        in.close();
    }
}