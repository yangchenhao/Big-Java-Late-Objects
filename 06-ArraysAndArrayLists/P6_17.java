/*In this assignment, you will model the game of Bulgarian Solitaire. The game starts
with 45 cards. (They need not be playing cards. Unmarked index cards work just as
well.) Randomly divide them into some number of piles of random size. For exam­ple,
you might start with piles of size 20, 5, 1, 9, and 10. In each round, you take one
card from each pile, forming a new pile with these cards. For example, the sample
starting configuration would be transformed into piles of size 19, 4, 8, 9, and 5. The
solitaire is over when the piles have size 1, 2, 3, 4, 5, 6, 7, 8, and 9, in some order. (It
can be shown that you always end up with such a configuration.) In your program,
produce a random starting configuration and print it. Then keep applying the soli­taire
step and print the result. Stop when the solitaire final configuration is reached.*/

import java.util.ArrayList;
import java.util.Random;

public class P6_17 {
    public static void main(String[] args) {
        ArrayList<Integer> cards = divideCards();
        printCards(cards);

        while (!checkForEnd(cards)) {
            cards = makeNewPile(cards);
            printCards(cards);
        }

        printCards(cards);
    }

    public static ArrayList<Integer> makeNewPile(ArrayList<Integer> cards) {
        int newPile = 0;

        for (int i = 0; i < cards.size(); i++) {
            int currentElement = cards.get(i);
            cards.set(i, currentElement - 1);
            newPile += 1;
        }
        
        cards.add(newPile);

        for (int i = 0; i < cards.size(); i++) {
            int currentElement = cards.get(i);
            
            if (currentElement == 0) {
                cards.remove(i);
                i -= 1;
            }
        }

        return cards;
    }

    public static boolean checkForEnd(ArrayList<Integer> cards) {
        boolean isEnd = true;

        if (cards.size() == 9) {
            for (int i = 0; i < cards.size(); i++) {
                if (!(cards.contains(i + 1))) {
                    isEnd = false;
                    break;
                }
            }
        } else {
            isEnd = false;
        }

        return isEnd;
    }

    public static ArrayList<Integer> divideCards() {
        ArrayList<Integer> newCards = new ArrayList<Integer>();
        Random random = new Random();

        int maxCards = 45;
        while (maxCards > 0) {
            int randomNumber = random.nextInt(maxCards) + 1;
            newCards.add(randomNumber);
            maxCards = maxCards - randomNumber;
        }

        return newCards;
    }

    public static void printCards(ArrayList<Integer> cards) {
        for (int i = 0; i < cards.size(); i++) {
            System.out.print(cards.get(i) + " ");
        }

        System.out.println();
    }
}