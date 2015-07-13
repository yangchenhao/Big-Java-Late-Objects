/*Write a program that reads in three integers and prints “in order” if they are sorted in
ascending or descending order, or “not in order” otherwise.*/

import java.util.Scanner;

public class P3_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int first = in.nextInt();
        int second = in.nextInt();
        int third = in.nextInt();
        
        if ((first > second && second > third) || (first < second && second < third) ||
            (first >= second && second > third) || (first <= second && second < third) ||
            (first > second && second >= third) || (first < second && second <= third)) {
            System.out.println("In order");
        }
        else {
            System.out.println("Not in order");
        }
        
        in.close();
    }
}