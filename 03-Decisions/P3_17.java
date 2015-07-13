/*When two points in time are compared, each given as hours (in military time, rang­ing
from 0 and 23) and minutes, the following pseudocode determines which comes first.
If hour1 < hour2
     time1 comes first.
Else if hour1 and hour2 are the same
     If minute1 < minute2
         time1 comes first.
     Else if minute1 and minute2 are the same
         time1 and time2 are the same.
     Else
         time2 comes first.
Else
     time2 comes first.
Write a program that prompts the user for two points in time and prints the time that
comes first, then the other time.*/

import java.util.Scanner;

public class P3_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstTime = input.nextLine();
        int firstTimeHours = Integer.parseInt(firstTime.substring(0, 2));
        int firstTimeMinutes = Integer.parseInt(firstTime.substring(2));

        String secondTime = input.nextLine();
        int secondTimeHours = Integer.parseInt(secondTime.substring(0, 2));
        int secondTimeMinutes = Integer.parseInt(secondTime.substring(2));

        if (firstTimeHours < secondTimeHours) {
            System.out.println(firstTime);
            System.out.println(secondTime);
        }
        else if (firstTimeHours == secondTimeHours) {
            if (firstTimeMinutes < secondTimeMinutes) {
                System.out.println(firstTime);
                System.out.println(secondTime);
            }
            else if (firstTimeMinutes > secondTimeMinutes) {
                System.out.println(secondTime);
                System.out.println(firstTime);
            }
            else {
                System.out.println(firstTime);
                System.out.println(secondTime);
            }
        }
        else {
            System.out.println(firstTime);
            System.out.println(secondTime);
        }

        input.close();
    }
}