/*Use recursion to implement a method
public static boolean find(String text, String str)
that tests whether a given text contains a string. For example,
find("Mississippi", "sip") returns true.
Hint: If the text starts with the string you want to match, then you are done. If not,
consider the text that you obtain by removing the first character.*/

package tasks;

public class Finder {
    public static boolean find(String text, String str) {
        if (text.length() < str.length()) {
            return false;
        } else if (text.substring(0, str.length()).equals(str)) {
            return true;
        } else {
            return find(text.substring(1), str);
        }
    }

    public static void main(String[] args) {
        boolean isFound = find("Mississippi", "sip");
        System.out.printf("Word is finded? %s", isFound);
    }
}