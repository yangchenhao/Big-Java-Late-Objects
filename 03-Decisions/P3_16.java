/*Write a program that reads in three strings and sorts them lexicographically.
Enter three strings: Charlie Able Baker
Able
Baker
Charlie*/

import java.util.Scanner;

public class P3_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two strings: ");
        String first = input.next();
        String second = input.next();
        String third = input.next();

        input.close();

        String largest = null;
        String middle = null;
        String smallest = null;

        if (first.compareTo(second) == 0 && second.compareTo(third) == 0) {
            largest = first;
            middle = second;
            smallest = third;
        }

        if (first.compareTo(second) == 0) {
            if (first.compareTo(third) > 0) {
                largest = first;
                middle = second;
                smallest = third;
            }
            else if (first.compareTo(third) < 0) {
                largest = third;
                middle = first;
                smallest = second;
            }
        }

        if (second.compareTo(third) == 0) {
            if (second.compareTo(first) > 0) {
                largest = second;
                middle = third;
                smallest = first;
            }
            else if (second.compareTo(first) < 0) {
                largest = first;
                middle = second;
                smallest = third;
            }
        }

        if (first.compareTo(third) == 0) {
            if (first.compareTo(second) > 0) {
                largest = first;
                middle = third;
                smallest = second;
            }
            else if (first.compareTo(second) < 0) {
                largest = second;
                middle = first;
                smallest = third;
            }
        }

        if (first.compareTo(second) > 0 && first.compareTo(third) > 0) {
            largest = first;

            if (second.compareTo(third) > 0) {
                middle = second;
                smallest = third;
            }
            else if (second.compareTo(third) < 0) {
                middle = third;
                smallest = second;
            }
        }
        else if (second.compareTo(first) > 0 && second.compareTo(third) > 0) {
            largest = second;

            if (first.compareTo(third) > 0) {
                middle = first;
                smallest = third;
            }
            else if (first.compareTo(third) < 0) {
                middle = third;
                smallest = first;
            }
        }
        else if (third.compareTo(second) > 0 && third.compareTo(first) > 0) {
            largest = third;

            if (second.compareTo(first) > 0) {
                middle = second;
                smallest = first;
            }
            else if (second.compareTo(first) < 0) {
                middle = first;
                smallest = second;
            }
        }

        System.out.println(smallest);
        System.out.println(middle);
        System.out.println(largest);
    }
}