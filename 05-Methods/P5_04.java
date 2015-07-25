/*Write a method
public static String middle(String str)
that returns a string containing the middle character in str if the length of str is odd,
or the two middle characters if the length is even. For example, middle("middle")
returns "dd" .*/

public class P5_04 {
    public static void main(String[] args) {
        System.out.println(middle("blabla"));
        System.out.println(middle("software"));
        System.out.println(middle("Informatics"));
    }

    public static String middle(String str) {
        if (str.length() % 2 == 0) {
            int last = (str.length() / 2) + 1;
            int first = (str.length() / 2) - 1;

            return str.substring(first, last);
        } else {
            int position = str.length() / 2;

            return str.substring(position, position + 1);
        }
    }
}