/*Write a method String getTimeName(int hours, int minutes) that returns the English
name for a point in time, such as "ten minutes past two" , "half past three" , "a quarter to
four" , or "five o'clock" . Assume that hours is between 1 and 12.*/

import java.util.Scanner;

public class P5_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter hours: ");
        int hours = input.nextInt();
        System.out.print("Please enter minutes: ");
        int minutes = input.nextInt();
        input.close();

        System.out.println(getTimeName(hours, minutes));
    }

    public static String getTimeName(int hours, int minutes) {
        String fullHour = "";

        if (minutes == 45) {
            fullHour += "a quater to ";
            fullHour += getHours(hours - 1);
        } else if (minutes == 30) {
            fullHour += "half past ";
            fullHour += getHours(hours);
        } else if (minutes == 0) {
            fullHour += getHours(hours);
            fullHour += " o'clock";
        } else if (minutes < 30) {
            fullHour += getMinutes(minutes);
            fullHour += " minutes past ";
            fullHour += getHours(hours);
        } else if (minutes < 59) {
            fullHour += getHours(minutes);
            fullHour += " minutes before ";
            fullHour += getHours(hours + 1);
        }

        return fullHour;
    }

    public static String getMinutes(int minutes) {
        if (minutes == 1) {
            return "one";
        } else if (minutes == 2) {
            return "two";
        } else if (minutes == 3) {
            return "three";
        } else if (minutes == 4) {
            return "four";
        } else if (minutes == 5) {
            return "five";
        } else if (minutes == 6) {
            return "six";
        } else if (minutes == 7) {
            return "seven";
        } else if (minutes == 8) {
            return "eight";
        } else if (minutes == 9) {
            return "nine";
        } else if (minutes == 10) {
            return "ten";
        } else if (minutes == 11) {
            return "eleven";
        } else if (minutes == 12) {
            return "twelve";
        } else if (minutes == 13) {
            return "thirteen";
        } else if (minutes == 14) {
            return "fourteen";
        } else if (minutes == 15) {
            return "fifteen";
        } else if (minutes == 16) {
            return "sixteen";
        } else if (minutes == 17) {
            return "seventeen";
        } else if (minutes == 18) {
            return "eighteen";
        } else if (minutes == 19) {
            return "nineteen";
        } else if (minutes == 20) {
            return "twenty";
        } else if (minutes == 21) {
            return "twenty one";
        } else if (minutes == 22) {
            return "twenty two";
        } else if (minutes == 23) {
            return "twenty three";
        } else if (minutes == 24) {
            return "twenty four";
        } else if (minutes == 25) {
            return "twenty five";
        } else if (minutes == 26) {
            return "twenty six";
        } else if (minutes == 27) {
            return "twenty seven";
        } else if (minutes == 28) {
            return "twenty eight";
        } else if (minutes == 29) {
            return "twenty nine";
        } else {
            return "";
        }

    }

    public static String getHours(int hours) {
        if (hours == 12) {
            return "twelve";
        } else if (hours == 11) {
            return "eleven";
        } else if (hours == 10) {
            return "ten";
        } else if (hours == 9) {
            return "nine";
        } else if (hours == 8) {
            return "eight";
        } else if (hours == 7) {
            return "seven";
        } else if (hours == 6) {
            return "six";
        } else if (hours == 5) {
            return "five";
        } else if (hours == 4) {
            return "four";
        } else if (hours == 3) {
            return "three";
        } else if (hours == 2) {
            return "two";
        } else if (hours == 1) {
            return "one";
        } else {
            return "";
        }
    }
}