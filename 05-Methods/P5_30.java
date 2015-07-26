/*Having a secure password is a very important practice, when much of our information
is stored online. Write a program that validates a new password, following these rules:
•    The password must be at least 8 characters long.
•    The password must have at least one uppercase and one lowercase letter
•    The password must have at least one digit.
Write a program that asks for a password, then asks again to confirm it. If the
passwords don’t match or the rules are not fulfilled, prompt again. Your program
should include a method that checks whether a password is valid.*/

import java.util.Scanner;

public class P5_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your password: ");
        String password1 = input.nextLine();
        System.out.print("Please enter your password: ");
        String password2 = input.nextLine();

        boolean isValid = isPasswordValid(password1, password2);

        if (!isValid) {
            while (!isValid) {
                System.out.print("Please enter your password: ");
                password1 = input.nextLine();
                System.out.print("Please enter your password: ");
                password2 = input.nextLine();

                isValid = isPasswordValid(password1, password2);
            }
        }

        System.out.println("Congratulations! Your password is absolutely valid!");

        input.close();
    }

    public static boolean isPasswordValid(String password1, String password2) {
        boolean isPasswordsEqual = false;
        boolean isUppercaseAndLowercaseLetter = false;
        boolean isDigit = false;
        boolean isEnoughLong = false;

        // Check for identity of passwords
        isPasswordsEqual = password1.equals(password2);

        // Check whether there is lowercase and uppercase letters
        boolean isLowercaseCharacter = false;
        boolean isUppercaseCharacter = false;
        for (int i = 0; i < password1.length(); i++) {
            char currentChar = password1.charAt(i);

            if (Character.isLowerCase(currentChar)) {
                isLowercaseCharacter = true;
            } else if (Character.isUpperCase(currentChar)) {
                isUppercaseCharacter = true;
            }
        }
        isUppercaseAndLowercaseLetter = isLowercaseCharacter && isUppercaseCharacter;

        // Check whether there is digit letter
        for (int i = 0; i < password1.length(); i++) {
            char currentChar = password1.charAt(i);

            if (Character.isDigit(currentChar)) {
                isDigit = true;
            }
        }

        // Check is enough long
        isEnoughLong = password1.length() > 8 && password2.length() > 8;

        return isPasswordsEqual && isUppercaseAndLowercaseLetter && isDigit && isEnoughLong;
    }
}