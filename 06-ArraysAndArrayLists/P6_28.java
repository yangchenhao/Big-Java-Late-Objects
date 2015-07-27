/*Write a method
public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a,
ArrayList<Integer> b)
that merges two sorted array lists, producing a new sorted array list. Keep an index
into each array list, indicating how much of it has been processed already. Each time,
append the smallest unprocessed element from either array list, then advance the
index. For example, if a is
1  4  9  16
and b is
4  7  9  9  11
then mergeSorted returns the array list
1  4  4  7  9  9  9  11  16*/

import java.util.ArrayList;
import java.util.Scanner;

public class P6_28 {
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

        ArrayList<Integer> newArrayList = mergeSorted(firstArrayList, secondArrayList);
        for (int i = 0; i < newArrayList.size(); i++) {
            System.out.print(newArrayList.get(i) + " ");
        }
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> newArrayList = new ArrayList<Integer>();

        while (a.size() > 0 || b.size() > 0) {
            if (a.size() > 0 && b.size() > 0) {
                if (a.get(0) < b.get(0)) {
                    newArrayList.add(a.get(0));
                    a.remove(a.get(0));
                } else if (b.get(0) < a.get(0)) {
                    newArrayList.add(b.get(0));
                    b.remove(b.get(0));
                } else {
                    newArrayList.add(a.get(0));
                    a.remove(a.get(0));
                    newArrayList.add(b.get(0));
                    b.remove(b.get(0));
                }
            } else if (a.size() == 0) {
                newArrayList.add(b.get(0));
                b.remove(b.get(0));
            } else if (b.size() == 0) {
                newArrayList.add(a.get(0));
                a.remove(a.get(0));
            }
        }

        return newArrayList;
    }
}