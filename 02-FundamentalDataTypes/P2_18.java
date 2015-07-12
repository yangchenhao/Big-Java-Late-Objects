/*
Writing large letters. A large letter H can be produced like this:
 *   *
 *   *
 *****
 *   *
 *   *
It can be declared as a string literal like this:
final string LETTER_H = "*   *\n*   *\n*****\n*   *\n*   *\n";
(The \n escape sequence denotes a “newline” character that causes subsequent
characters to be printed on a new line.) Do the same for the letters E , L , and O . Then
write the message
H
E
L
L
O
in large letters.
*/

public class P2_18 {
    public static void main(String[] args) {
        final String letterH = "*   *\n*   *\n*****\n*   *\n*   *\n";
        final String letterE = "*****\n*    \n*****\n*     \n*****\n";
        final String letterL = "*    \n*    \n*    \n*    \n*****\n";
        final String letterO = "*****\n*   *\n*   *\n*   *\n*****\n";
        
        System.out.println(letterH);
        System.out.println(letterE);
        System.out.println(letterL);
        System.out.println(letterL);
        System.out.println(letterO);
    }
}