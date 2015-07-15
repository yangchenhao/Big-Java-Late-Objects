/*Write a program that prompts for the day and month of the user’s birthday and then
prints a horoscope. Make up fortunes for programmers, like this:
Please enter your birthday (month and day): 6 16
Gemini are experts at figuring out the behavior of complicated programs.
You feel where bugs are coming from and then stay one step ahead. Tonight,
your style wins approval from a tough critic.
Each fortune should contain the name of the astrological sign. (You will find the
names and date ranges of the signs at a distressingly large number of sites on the
Internet.)*/

import java.util.Scanner;

public class P3_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your birthday (month and day): ");
        int month = input.nextInt();
        int day = input.nextInt();
        input.close();

        if (month < 1 || month > 12) {
            System.out.println("You have entered incorrect month!");
            return;
        }
        if (day < 1 || day > 31) {
            System.out.println("You have entered incorrect day!");
            return;
        }

        String zodiacSign = null;

        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            zodiacSign = "Aries";
        }
        else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            zodiacSign = "Taurus";
        }
        else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            zodiacSign = "Gemini";
        }
        else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            zodiacSign = "Cancer";
        }
        else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            zodiacSign = "Leo";
        }
        else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            zodiacSign = "Virgo";
        }
        else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            zodiacSign = "Libra";
        }
        else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            zodiacSign = "Scorpio";
        }
        else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            zodiacSign = "Sagittarius";
        }
        else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            zodiacSign = "Capricorn";
        }
        else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            zodiacSign = "Aquarius";
        }
        else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            zodiacSign = "Pisces";
        }

        if (zodiacSign.equals("Aries")) {
            System.out.println("Aries: Active, Demanding, Determined, Effective, Ambitious");
        }
        else if (zodiacSign.equals("Taurus")) {
            System.out.println("Taurus: Security, Subtle strength, Appreciation, Instruction, Patience");
        }
        else if (zodiacSign.equals("Gemini")) {
            System.out.println("Gemini: Communication, Indecision, Inquisitive, Intelligent, Changeable");
        }
        else if (zodiacSign.equals("Cancer")) {
            System.out.println("Cancer: Emotion, Diplomatic, Intensity, Impulsive, Selective");
        }
        else if (zodiacSign.equals("Leo")) {
            System.out.println("Leo: Ruling, Warmth, Generosity, Faithful, Initiative");
        }
        else if (zodiacSign.equals("Virgo")) {
            System.out.println("Virgo: Analyzing, Practical, Reflective, Observation, Thoughtful");
        }
        else if (zodiacSign.equals("Libra")) {
            System.out.println("Libra: Balance, Justice, Truth, Beauty, Perfection");
        }
        else if (zodiacSign.equals("Scorpio")) {
            System.out.println("Scorpio: Transient, Self-Willed, Purposeful, Unyielding");
        }
        else if (zodiacSign.equals("Saggitarius")) {
            System.out.println("Saggitarius: Philosophical, Motion, Experimentation, Optimism");
        }
        else if (zodiacSign.equals("Capricorn")) {
            System.out.println("Capricorn: Determination, Dominance, Perservering, Practical, Willful");
        }
        else if (zodiacSign.equals("Aquarius")) {
            System.out.println("Aquarius: Knowledge, Humanitarian, Serious, Insightful, Duplicitous");
        }
        else if (zodiacSign.equals("Pisces")) {
            System.out.println("Pisces: Fluctuation, Depth, Imagination, Reactive, Indecisive");
        }
    }
}