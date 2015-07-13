/*Write a program that reads three numbers and prints “all the same” if they are all the
same, “all different” if they are all different, and “neither” otherwise.*/

import java.util.Scanner;

public class P3_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int first = in.nextInt();
        int second = in.nextInt();
        int third = in.nextInt();
        
        if (first == second && second == third) {
            System.out.println("all the same");
        }
        else if (first != second && second != third && first != third) {
            System.out.println("all different");
        }
        else {
            System.out.println("neither");
        }
        
        in.close();
    }
}