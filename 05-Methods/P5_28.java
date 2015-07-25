/*A non-governmental organization needs a program to calculate the amount of financial
assistance for needy families. The formula is as follows:
•    If the annual household income is between $30,000 and $40,000 and the
household has at least three children, the amount is $1,000 per child.
•    If the annual household income is between $20,000 and $30,000 and the
household has at least two children, the amount is $1,500 per child.
•    If the annual household income is less than $20,000, the amount is $2,000 per child.
Implement a method for this computation. Write a program that asks for the house-
hold income and number of children for each applicant, printing the amount
returned by your method. Use –1 as a sentinel value for the input.*/

import java.util.Scanner;

public class P5_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your income: ");
        int income = input.nextInt();
        System.out.print("Please enter number of your children: ");
        int numberOfChildren = input.nextInt();
        input.close();

        int amount = amountOfAssistance(income, numberOfChildren);
        System.out.printf("Amount of assistance is: %d", amount);
    }

    public static int amountOfAssistance(double income, int numberOfChildren) {
        if (income > 30000 && income <= 40000) {
            return numberOfChildren * 1000;
        } else if (income > 20000 & income <= 30000) {
            return numberOfChildren * 1500;
        } else {
            return numberOfChildren * 2000;
        }
    }
}