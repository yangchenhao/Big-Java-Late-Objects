/*Write a recursive method String reverse(String text) that reverses a string. For
example, reverse("Hello!") returns the string "!olleH" . Implement a recursive solution
by removing the first character, reversing the remaining text, and combining the two.*/

package tasks;

public class StringReverser {
    public static String reverse(String text) {
        if (text.length() == 1) {
            return text;
        } else {
            return reverse(text.substring(1)) + text.substring(0, 1);
        }
    }

    public static void main(String[] args) {
        String newString = StringReverser.reverse("Hello!");
        System.out.printf("Reversed string is: %s", newString);
    }
}