/*Write a method
 public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b)
 that appends one array list after another. For example, if a is
 1  4  9  16
 and b is
 9  7  4  9  11
 then append returns the array list
 1  4  9  16  9  7  4  9  11*/

import java.util.ArrayList;
import java.util.Scanner;

public class P6_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> firstArrayList = new ArrayList<Integer>();
        System.out.print("Please enter length of first arraylist: ");
        int lengthFirstArrayList = input.nextInt();
        for (int i = 0; i < lengthFirstArrayList; i++) {
            System.out.print("Enter element for first arraylist: ");
            firstArrayList.add(input.nextInt());
        }

        ArrayList<Integer> secondArrayList = new ArrayList<Integer>();
        System.out.print("Please enter length of second arraylist: ");
        int lengthSecondArrayList = input.nextInt();
        for (int i = 0; i < lengthSecondArrayList; i++) {
            System.out.print("Enter element for second arraylist: ");
            secondArrayList.add(input.nextInt());
        }

        input.close();

        ArrayList<Integer> newArrayList = append(firstArrayList, secondArrayList);
        System.out.print("All entered elements: ");
        printEnteredElements(newArrayList);
    }

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> newArrayList = new ArrayList<Integer>();

        for (int i = 0; i < a.size(); i++) {
            newArrayList.add(a.get(i));
        }

        for (int i = 0; i < b.size(); i++) {
            newArrayList.add(b.get(i));
        }

        return newArrayList;
    }

    public static void printEnteredElements(ArrayList<Integer> newArrayList) {
        for (int i = 0; i < newArrayList.size(); i++) {
            System.out.print(newArrayList.get(i) + " ");
        }
    }
}