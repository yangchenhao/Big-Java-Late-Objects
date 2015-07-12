/*
Write a program that reads two times in military format (0900, 1730) and prints the
number of hours and minutes between the two times. Here is a sample run. User
input is in color.
Please enter the first time: 0900
Please enter the second time: 1730
8 hours 30 minutes
Extra credit if you can deal with the case where the first time is later than the ­second:
Please enter the first time: 1730
Please enter the second time: 0900
15 hours 30 minutes
*/

import java.util.Scanner;

public class P2_17 {
    public static void main(String[] args) {
        final int MINUTES_PER_DAY = 1440;
        final int MINUTES_PER_HOUR = 60;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the first time: ");
        String firstTime = in.nextLine();
        int firstTimeHours = Integer.parseInt(firstTime.substring(0, 2));
        int firstTimeMinutes = Integer.parseInt(firstTime.substring(2));
        int firstTimeAllMinutes = firstTimeHours * MINUTES_PER_HOUR + firstTimeMinutes;

        System.out.println("Please enter the second time: ");
        String secondTime = in.nextLine();
        int secondTimeHours = Integer.parseInt(secondTime.substring(0, 2));
        int secondTimeMinutes = Integer.parseInt(secondTime.substring(2));
        int secondTimeAllMinutes = secondTimeHours * MINUTES_PER_HOUR + secondTimeMinutes;

        int differenceInMinutes = secondTimeAllMinutes - firstTimeAllMinutes;
        int totalMinutes = (MINUTES_PER_DAY + differenceInMinutes) % MINUTES_PER_DAY;
        int totalHours = totalMinutes / MINUTES_PER_HOUR;
        totalMinutes = totalMinutes % MINUTES_PER_HOUR;

        System.out.println(totalHours + " Hours " + totalMinutes + " Minutes ");

        in.close();
    }
}