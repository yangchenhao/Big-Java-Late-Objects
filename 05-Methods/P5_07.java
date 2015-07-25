/*Write a method
public static int countWords(String str)
that returns a count of all words in the string str . Words are separated by spaces. For
example, count­Words("Mary had a little lamb") should return 5.*/

public class P5_07 {
    public static void main(String[] args) {
        System.out.println(countWords("asaf aaf faf"));
        System.out.println(countWords("Dog Cat Mouse Mice"));
    }

    public static int countWords(String str) {
        int countWords = 1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                countWords++;
            }
        }

        return countWords;
    }
}