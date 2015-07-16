/*Calculating the tip when you go to a restaurant is not difficult, but your restaurant
wants to suggest a tip according to the service diners receive. Write a program that
calculates a tip according to the diner’s satisfaction as follows:
•    Ask for the diners’ satisfaction level using these ratings: 1 = Totally satisfied, 2
= Satisfied, 3 = Dissatisfied.
•    If the diner is totally satisfied, calculate a 20 percent tip.
•    If the diner is satisfied, calculate a 15 percent tip.
•    If the diner is dissatisfied, calculate a 10 percent tip.
•    Report the satisfaction level and tip in dollars and cents.*/

import java.util.Scanner;

public class P3_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter dinner payment: ");
        double dinnerPay = input.nextDouble();
        
        System.out.println("Enter satisfaction level(Tottaly satisfied, Satisfied, Dissatisfied): ");
        int satisfactionLevel = input.nextInt();
        
        double tip = 0;
        
        if (satisfactionLevel == 1) {
            tip = dinnerPay * 0.2;
        }
        else if (satisfactionLevel == 2){
            tip = dinnerPay * 0.15;
        }
        else if (satisfactionLevel == 3) {
            tip = dinnerPay * 0.1;
        }
        
        System.out.printf("Pay was: %.2f, tip was %.2f", dinnerPay, tip);
        
        input.close();
    }
}