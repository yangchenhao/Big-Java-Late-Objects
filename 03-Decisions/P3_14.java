/*Write a program that takes user input describing a playing card in the following
shorthand notation:
A       
2 ... 10    
J       
Q       
K       
D       
H       
S       
C       
Ace
Card values
Jack
Queen
King
Diamonds
Hearts
Spades
Clubs
Your program should print the full description of the card. For example,
Enter the card notation: QS
Queen of Spades*/

import java.util.Scanner;

public class P3_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String card = input.nextLine();
        input.close();

        char rank = card.charAt(0);
        char suit = card.charAt(1);

        String cardName = null;
        
        if (rank == 'A') {
            cardName += "Ace";
        }
        else if (rank == 'J') {
            cardName += "Jack";
        }
        else if (rank == 'Q') {
            cardName += "Queen";
        }
        else if (rank == 'K') {
            cardName += "King";
        }
        else {
            cardName += rank;
        }

        cardName += "of";

        if (suit == 'S') {
            cardName += "Spades";
        }
        else if (suit == 'D') {
            cardName += "Diamonds";
        }
        else if (suit == 'H') {
            cardName += "Hearts";
        }
        else if (suit == 'C') {
            cardName += "Clubs";
        }

        System.out.printf("The card is: %s", cardName);
    }
}