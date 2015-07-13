/*Write a program that reads three numbers and prints “increasing” if they are in
increasing order, “decreasing” if they are in decreasing order, and “neither” other­
wise. Here, “increasing” means “strictly increasing”, with each value larger than its
pre­decessor. The sequence 3 4 4 would not be considered increasing.*/

import java.util.Scanner;

public class P3_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int first = in.nextInt();
        int second = in.nextInt();
        int third = in.nextInt();
        
        if (first < second && second < third) {
            System.out.println("increasing");
        }
        else if (first > second && second > third) {
            System.out.println("decreasing");
        }
        else {
            System.out.println("neither");
        }
        
        in.close();
        
    }
}