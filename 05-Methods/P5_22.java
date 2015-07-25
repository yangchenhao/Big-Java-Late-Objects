/*Write a method that computes the balance of a bank account with a given initial balance 
and interest rate, after a given number of years. Assume interest is com­pounded yearly.*/

import java.util.Scanner;

public class P5_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter initial balance: ");
        double initialBalance = input.nextDouble();
        System.out.print("Please enter interest rate: ");
        double interestRate = input.nextDouble();
        System.out.print("Please enter years: ");
        int years = input.nextInt();
        input.close();

        System.out.printf("Balance is: %.2f", balance(initialBalance, interestRate, years));
    }

    public static double balance(double initialBalance, double interestRate, int years) {
        double interest = initialBalance * (interestRate / 100.0);
        double balance = initialBalance + interest;

        while (years > 0) {
            balance += interest;
            interest = balance * (interestRate / 100.0);
            years--;
        }

        return balance;
    }
}