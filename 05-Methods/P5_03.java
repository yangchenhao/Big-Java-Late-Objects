/*Write the following methods.
a.   int firstDigit(int n) , returning the first digit of the argument
b.   int lastDigit(int n) , returning the last digit of the argument
c.   int digits(int n) , returning the number of digits of the argument
For example, firstDigit(1729) is 1, lastDigit(1729) is 9, and digits(1729) is 4. Provide a
program that tests your methods.*/

public class P5_03 {
    public static void main(String[] args) {
        System.out.println(firstDigit(101));
        System.out.println(firstDigit(8801));
        System.out.println(lastDigit(10));
        System.out.println(lastDigit(1008));
        System.out.println(digits(202020));
        System.out.println(digits(2414));
    }

    public static int firstDigit(int n) {
        while (n > 9) {
            n = n / 10;
        }

        return n;
    }

    public static int lastDigit(int n) {
        return n % 10;
    }

    public static int digits(int n) {
        int counterOfDigits = 0;

        while (n > 0) {
            n = n / 10;
            counterOfDigits++;
        }

        return counterOfDigits;
    }
}