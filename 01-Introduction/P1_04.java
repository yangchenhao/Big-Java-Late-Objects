/*
Write a program that prints the balance of an account after the first, second, and
third year. The account has an initial balance of $1,000 and earns 5 percent interest
per year.
*/

public class P1_04 {
	public static void main(String[] args){
		double balance = 1000;
		double percentInterestPerYear = 0.05;
		
		for(int year = 1; year <= 3; year++){
			balance = balance + balance * percentInterestPerYear;
			System.out.printf("Year balance for %d year is %.2f \n", year, balance);	
		}
	}
}