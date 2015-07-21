/*Write a program that prints all powers of 2 from 2 0 up to 2 20 .*/

public class P4_13 {
    public static void main(String[] args){
        for (int i = 0; i <= 20; i++) {
            System.out.printf("Pow of 2 to %d is: %d\n",i, (int)Math.pow(2, i));
        }
    }
}