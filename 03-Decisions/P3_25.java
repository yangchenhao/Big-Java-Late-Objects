/*Write a program that prompts the user to provide a single character from the alpha­
bet. Print Vowel or Consonant, depending on the user input. If the user input is
not a letter (between a and z or A and Z), or is a string of length > 1, print an error
message.*/

import java.util.Scanner;

public class P3_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter single character from alphabet: ");
        String character = input.nextLine().toLowerCase();
        input.close();

        if (character.length() == 1 && Character.isLetter(character.charAt(0))) {
            if (character.charAt(0) == 'a' || character.charAt(0) == 'o'
                    || character.charAt(0) == 'e' || character.charAt(0) == 'i'
                    || character.charAt(0) == 'y' || character.charAt(0) == 'u') {
                System.out.println("Vowel");
            }
            else {
                System.out.println("Consonant");
            }
        }
        else {
            System.out.println("Error with string!");
        }
    }
}