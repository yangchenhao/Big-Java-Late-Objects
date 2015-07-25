/*Write a method
public static int countVowels(String str)
that returns a count of all vowels in the string str.
Vowels are the letters a, e, i, o, and u, and their upper­case variants.*/

public class P5_06 {
    public static void main(String[] args) {
        System.out.println(countVowels("agajgkalarE"));
    }

    public static int countVowels(String str) {
        int counterOfVowels = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = Character.toLowerCase(str.charAt(i));

            if (currentChar == 'a' || currentChar == 'o' || currentChar == 'e'
                    || currentChar == 'y' || currentChar == 'u' || currentChar == 'i') {
                counterOfVowels++;
            }
        }

        return counterOfVowels;
    }
}