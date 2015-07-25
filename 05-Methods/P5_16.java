/*Write a recursive method
public static boolean isPalindrome(String str)
that returns true if str is a palindrome, that is, a word that is the same when reversed.
Examples of palin­drome are “deed”, “rotor”, or “aibohphobia”. Hint: A word is a
palindrome if the first and last letters match and the remainder is also a palindrome.*/

import java.util.Scanner;

public class P5_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter word: ");
        String word = input.next();
        System.out.println(isPalindrome(word));
        input.close();
    }

    public static boolean isPalindrome(String str) {
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        } else if (str.length() <= 2) {
            return true;
        } else {
            return isPalindrome(str.substring(1, str.length() - 1));
        }
    }
}