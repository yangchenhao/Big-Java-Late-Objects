/*Use recursion to implement a method
public static boolean find(String str, String match)
that tests whether match is contained in str :
boolean b = find("Mississippi", "sip"); // Sets b to true
Hint: If str starts with match , then you are done. If not, consider the string that you
obtain by removing the first character.*/

public class P5_17 {
    public static void main(String[] args) {
        System.out.println(find("Mississippi", "sip"));
        System.out.println(find("Donau", "ue"));
    }

    public static boolean find(String str, String match) {
        if (str.length() < match.length()) {
            return false;
        } else if (str.substring(0, match.length()).equals(match)) {
            return true;
        } else {
            return find(str.substring(1), match);
        }
    }
}