/*
Write a program that prints the sum of the first ten positive integers,
1 + 2 + ... + 10.
*/

public class P1_02 {
    public static void main(String[] args){
        int sum = 0;

        for (int i = 0; i <= 10; i++) {
            sum = i;
            System.out.println(sum);
        }
    }
}
