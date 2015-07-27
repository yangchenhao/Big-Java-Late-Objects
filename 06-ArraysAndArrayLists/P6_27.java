/*Write a method
public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b)
that merges two array lists, alternating elements from both array lists. If one array
list is shorter than the other, then alternate as long as you can and then append the
remaining elements from the longer array list. For example, if a is
1  4  9  16
and b is
9  7  4  9  11
then merge returns the array list
1  9  4  7  9  4  16  9  11*/

import java.util.ArrayList;
import java.util.Scanner;

public class P6_27 {
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

        ArrayList<Integer> newArrayList = merge(firstArrayList, secondArrayList);
        for (int i = 0; i < newArrayList.size(); i++) {
            System.out.print(newArrayList.get(i) + " ");
        }
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> newArrayList = new ArrayList<Integer>();

        while (a.size() > 0 || b.size() > 0) {
            if (a.size() > 0) {
                newArrayList.add(a.get(0));
                a.remove(0);
            }
            
            if (b.size() > 0) {
                newArrayList.add(b.get(0));
                b.remove(0);
            }
        }

        return newArrayList;
    }
}