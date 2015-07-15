/*Write a program that computes taxes for the following schedule.
 if your status is single and
 if the taxable income is over   but not over        the tax is          of the amount over
     $0                              $8,000                  10%                 $0
  $8,000                             $32,000              $800 +  15%           $8,000
  $32,000                                                 $4,400 + 25%          $32,000
 if your status is Married and
 if the taxable income is over    but not over        the tax is           of the amount over
  $0                              $16,000                  10%                     $0
  $16,000                         $64,000                 $1,600 + 15%            $16,000
  $64,000                                                  $8,800 + 25%           $64,000
 */

import java.util.Scanner;

public class P3_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your status(Married/Single): ");
        String status = input.nextLine().toLowerCase();

        System.out.print("Please enter your income: ");
        double income = input.nextDouble();

        input.close();

        double tax = 0;
        if (status.equals("single")) {
            if (income > 0 && income <= 8000) {
                tax = income * 0.1;
            }
            else if (income > 8000 && income <= 32000) {
                tax += 800 + income * 0.15;
            }
            else if (income > 32000) {
                tax += 4400 + income * 0.25;
            }
        }
        else if (status.equals("married")) {
            if (income > 0 && income <= 1600) {
                tax = income * 0.1;
            }
            else if (income > 16000 && income <= 64000) {
                tax += 1600 + income * 0.15;
            }
            else if (income > 32000) {
                tax += 8800 + income * 0.25;
            }
        }
        else if (!status.equals("single") && !status.equals("married")) {
            System.out.println("Invalid status!");
            return;
        }
        else if (income < 1) {
            System.out.println("Not valid income!");
            return;
        }

        System.out.printf("Your tax is: ", tax);
        
        input.close();
    }
}