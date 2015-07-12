/*
Printing a grid. Write a program that prints the following grid to play tic-tac-toe.
+--+--+--+
|  |  |  |
+--+--+--+
|  |  |  |
+--+--+--+
|  |  |  |
+--+--+--+
Of course, you could simply write seven statements of the form
System.out.println("+--+--+--+");
You should do it the smart way, though. Declare string variables to hold two kinds
of patterns: a comb-shaped pattern and the bottom line. Print the comb three times
and the bottom line once.
*/

public class P2_15 {
    public static void main(String[] args) {
        String combShapedPattern = "+--+--+--+\n|  |  |  |";
        String bottomLine = "+--+--+--+";

        System.out.println(combShapedPattern);
        System.out.println(combShapedPattern);
        System.out.println(combShapedPattern);
        System.out.println(bottomLine);
    }
}