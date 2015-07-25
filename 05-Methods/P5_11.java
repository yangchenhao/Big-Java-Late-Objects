/*Enhance the intName method so that it works correctly for values < 1,000,000,000.*/

import java.util.Scanner;

public class P5_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println(intName(number));
        input.close();
    }

    public static String intName(int number) {
        int partNumber = number;
        String name = "";

        if (partNumber >= 1000000) {
            name = digitName(partNumber / 1000000) + "million";
            partNumber %= 1000000;
        }

        if (partNumber >= 1000) {
            name = digitName(partNumber / 100) + "thousand";
            partNumber %= 1000;
        }

        if (partNumber >= 100) {
            name = digitName(partNumber / 100) + " hundred";
            partNumber = partNumber % 100;
        }

        if (partNumber >= 20) {
            name = name + " " + tensName(partNumber);
            partNumber = partNumber % 10;
        } else if (partNumber >= 10) {
            name = name + " " + teenName(partNumber);
            partNumber = 0;
        }

        if (partNumber > 0) {
            name = name + " " + digitName(partNumber);
        }

        return name;
    }

    public static String digitName(int digit) {
        if (digit == 1) {
            return "one";
        }
        
        if (digit == 2) {
            return "two";
        }
        
        if (digit == 3) {
            return "three";
        }
        
        if (digit == 4) {
            return "four";
        }
        
        if (digit == 5) {
            return "five";
        }
        
        if (digit == 6) {
            return "six";
        }
        
        if (digit == 7) {
            return "seven";
        }
        
        if (digit == 8) {
            return "eight";
        }
        
        if (digit == 9) {
            return "nine";
        }
        
        return "";
    }

    public static String teenName(int number) {
        if (number == 10) {
            return "ten";
        }
        
        if (number == 11) {
            return "eleven";
        }
        
        if (number == 12) {
            return "twelve";
        }
        
        if (number == 13) {
            return "thirteen";
        }
        
        if (number == 14) {
            return "fourteen";
        }
        
        if (number == 15) {
            return "fifteen";
        }
        
        if (number == 16) {
            return "sixteen";
        }
        
        if (number == 17) {
            return "seventeen";
        }
        
        if (number == 18) {
            return "eighteen";
        }
        if (number == 19) {
            return "nineteen";
        }
        
        return "";
    }

    public static String tensName(int number) {
        if (number >= 90) {
            return "ninety";
        }
        
        if (number >= 80) {
            return "eighty";
        }
        
        if (number >= 70) {
            return "seventy";
        }
        
        if (number >= 60) {
            return "sixty";
        }
        
        if (number >= 50) {
            return "fifty";
        }

        if (number >= 40) {
            return "fourty";
        }

        if (number >= 30) {
            return "thirty";
        }

        if (number >= 20) {
            return "twenty";
        }

        return "";
    }
}