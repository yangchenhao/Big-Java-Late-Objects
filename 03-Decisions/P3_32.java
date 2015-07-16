/*When you use an automated teller machine (ATM) with your bank card, you need
 to use a personal identification number (PIN) to access your account. If a user fails
 more than three times when entering the PIN, the machine will block the card.
 Assume that the user’s PIN is “1234” and write a program that asks the user for the
 PIN no more than three times, and does the following:
 •    If the user enters the right number, print a message saying, “Your PIN is
 correct”, and end the program.
 •    If the user enters a wrong number, print a message saying, “Your PIN is
 incorrect” and, if you have asked for the PIN less than three times, ask for it
 again.
 •    If the user enters a wrong number three times, print a message saying “Your
 bank card is blocked” and end the program.*/

import java.util.Scanner;

public class P3_32 {
    public static void main(String[] args) {
        final int USER_PIN = 1234;

        boolean isPinRight = false;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your PIN CODE");
        int pinCode = input.nextInt();

        if (pinCode == USER_PIN) {
            isPinRight = true;
        }
        else {
            isPinRight = false;
            pinCode = input.nextInt();

            if (pinCode == USER_PIN) {
                isPinRight = true;
            }
            else {
                isPinRight = false;
                pinCode = input.nextInt();

                if (pinCode == USER_PIN) {
                    isPinRight = true;
                }
                else {
                    System.out.println("Your bank card is blocked!");
                    input.close();
                    return;
                }
            }
        }

        if (isPinRight) {
            System.out.println("Your PIN CODE is correct!");
        }
        else {
            System.out.println("Your PIN CODE is incorrect");
        }

        input.close();
    }
}