/*Write a program to simulate a bank transaction. There are two bank accounts: check­
ing and savings. First, ask for the initial balances of the bank accounts; reject nega­
tive balances. Then ask for the transactions; options are deposit, withdrawal, and
transfer. Then ask for the account; options are checking and savings. Then ask for the
amount; reject transactions that overdraw an account. At the end, print the balances
of both accounts.*/

import java.util.Scanner;

public class P3_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter intial balance of checking account: ");
        double checkingBalance = input.nextDouble();
        System.out.print("Please enter intial balance of savings account: ");
        double savingsBalance = input.nextDouble();

        if (checkingBalance < 0 || savingsBalance < 0) {
            System.out.println("Balances must be greater than 0!");
            input.close();
            return;
        }

        System.out.println("Enter kind of transaction (deposit, withdrawal, transfer): ");
        String transaction = input.next();
        System.out.println("Enter kind of account (checking, savings)");
        String account = input.next();
        System.out.print("Please enter an amount: ");
        double amount = input.nextDouble();

        input.close();

        if (transaction.equals("deposit")) {
            if (account.equals("checking")) {
                checkingBalance += amount;
            }
            else if (account.equals("savings")) {
                savingsBalance += amount;
            }
        }
        else if (transaction.equals("withdrawal")) {
            if (account.equals("checking")) {
                if (checkingBalance < amount) {
                    System.out.println("You can not withdrawal %.2f money");
                }
                else {
                    checkingBalance -= amount;
                }
            }
            else if (account.equals("savings")) {
                if (checkingBalance < amount) {
                    System.out.println("You can not withdrawal %.2f money");
                }
                else {
                    checkingBalance -= amount;
                }
            }
        }
        else if (transaction.equals("transfer")) {
            if (account.equals("checking")) {
                if (savingsBalance < amount) {
                    System.out.println("You cant transfer such amount of money!");
                }
                else {
                    checkingBalance += amount;
                    savingsBalance -= amount;
                }
            }
            else if (account.equals("savings")) {
                if (checkingBalance < amount) {
                    System.out.println("You cant transfer such amount of money!");
                }
                else {
                    savingsBalance += amount;
                    checkingBalance -= amount;

                }
            }
        }

        System.out.printf("Money of checking account after procedures are: %.2f \n", checkingBalance);
        System.out.printf("Money of savings account after procedures are: %.2f \n", savingsBalance);
    }
}