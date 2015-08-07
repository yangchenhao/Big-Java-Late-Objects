/*Use recursion to implement a method
public static int indexOf(String text, String str)
that returns the starting position of the first substring of the text that matches str .
Return –1 if str is not a substring of the text.
For example, s.indexOf("Mississippi", "sip") returns 6.
Hint: This is a bit trickier than Exercise P13.6, because you must keep track of how
far the match is from the beginning of the text. Make that value a parameter variable
of a helper method.*/
package tasks;

public class IndexOf {
    public static int indexOf(String text, String str) {
        return indexOf(text, str, 0);
    }

    public static int indexOf(String text, String str, int startIndex) {
        if (text.length() < str.length()) {
            return -1;
        } else if (text.substring(0, str.length()).equals(str)) {
            return startIndex;
        } else {
            return indexOf(text.substring(1), str, startIndex + 1);
        }
    }

    public static void main(String[] args) {
        int index = indexOf("Mississippi", "sip");
        if (index == -1) {
            System.out.println("This string is not substring of the text!");
        } else if (index != -1) {
            System.out.printf("Starting index of substring is: %d", index);
        }
    }
}