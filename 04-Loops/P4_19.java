/*Write a program that prints a multiplication table, like this:
 1    2   3   4   5   6   7   8   9   10
 2    4   6   8   10  12  14  16  18  20
 3    6   9   12  15  18  21  24  27  30
 . . .
 10   20  30  40  50  60  70  80  90  100
*/

public class P4_19 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%3d ", i * j);
            }

            System.out.println();
        }
    }
}