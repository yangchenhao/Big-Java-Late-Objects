/*
Write a program that prints the product of the first ten positive integers,
1 × 2 × ... × 10. (Use * to indicate multiplication in Java.)
*/

public class P1_03 {
	public static void main(String[] args){
		int product = 1;
		
		for (int i = 2; i <= 10; i++) {
			product *= i;
		}
		
		System.out.println(product);
	}
}