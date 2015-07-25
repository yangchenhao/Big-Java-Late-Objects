/*Write a method
public static String repeat(String str, int n)
that returns the string str repeated n times.
For example, repeat("ho", 3) returns "hohoho".*/

public class P5_05 {
    public static void main(String[] args) {
        System.out.println(repeat("ho", 3));
        System.out.println(repeat("mechka", 5));
    }

    public static String repeat(String str, int n) {
        String newWord = "";
        for (int i = 0; i < n; i++) {
            newWord += str;
        }

        return newWord;
    }
}