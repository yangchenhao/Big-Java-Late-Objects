/*French country names are feminine when they end with the letter e, masculine other­
 wise, except for the following which are masculine even though they end with e:
 •    le Belize
 •    le Cambodge
 •    le Mexique
 •    le Mozambique
 •    le Zaïre
 •    le Zimbabwe
 Write a program that reads the French name of a country and adds the article: le for
 masculine or la for feminine, such as le Canada or la Belgique.
 However, if the country name starts with a vowel, use l’; for example, l’Afghanistan.
 For the following plural country names, use les:
 •    les Etats-Unis
 •    les Pays-Bas*/

import java.util.Scanner;

public class P3_29 {
    public static void main(String[] args) {
        System.out.print("Please enter name of country: ");
        Scanner input = new Scanner(System.in);
        String countryName = input.nextLine();
        input.close();

        if (countryName.equals("Etats-Unis") || countryName.equals("Pays-Bas")) {
            System.out.println("les " + countryName);
        }
        else if (countryName.charAt(0) == 'A' || countryName.charAt(0) == 'E' ||
                 countryName.charAt(0) == 'O' || countryName.charAt(0) == 'U' ||
                 countryName.charAt(0) == 'Y' || countryName.charAt(0) == 'I') {
            System.out.println("l\' " + countryName);
        }
        else if (countryName.equals("Belize") || countryName.equals("Cambodge") ||
                 countryName.equals("Mexique") || countryName.equals("Mozambique") ||
                 countryName.equals("Zaïre") || countryName.equals("Zimbabwe")) {
            System.out.println("le " + countryName);
        }
        else if (countryName.substring(countryName.length() - 1).equals("e")) {
            System.out.println("la " + countryName);
        }

        else {
            System.out.println("le " + countryName);
        }
    }
}