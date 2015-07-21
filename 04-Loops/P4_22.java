/*The game of Nim. This is a well-known game with a number of variants. The fol­lowing
variant has an interesting winning strategy. Two players alternately take
marbles from a pile. In each move, a player chooses how many marbles to take. The
player must take at least one but at most half of the marbles. Then the other player
takes a turn. The player who takes the last marble loses.
Write a program in which the computer plays against a human opponent. Generate a
random integer between 10 and 100 to denote the initial size of the pile. Generate a
random integer between 0 and 1 to decide whether the computer or the human takes
the first turn. Generate a random integer between 0 and 1 to decide whether the
computer plays smart or stupid. In stupid mode the computer simply takes a random
legal value (between 1 and n/2) from the pile whenever it has a turn. In smart mode
the computer takes off enough marbles to make the size of the pile a power of two
minus 1—that is, 3, 7, 15, 31, or 63. That is always a legal move, except when the size
of the pile is currently one less than a power of two. In that case, the computer makes
a random legal move.
You will note that the computer cannot be beaten in smart mode when it has the first
move, unless the pile size happens to be 15, 31, or 63. Of course, a human player who
has the first turn and knows the win­ning strategy can win against the computer.*/

import java.util.Scanner;
import java.util.Random;

public class P4_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int sizeOfPile = random.nextInt(91) + 10;
        int currentTurn = random.nextInt(2);
        int computerIntellect = random.nextInt(2);

        while (sizeOfPile > 0) {
            System.out.printf("Number of marbles: %d\n", sizeOfPile);

            if (currentTurn == 1) {
                System.out.println("Your move!");
                int halfPileSize = sizeOfPile / 2;
                int marblesToRemove = 0;

                do {
                    System.out.printf("Choose number of marbles to remove from pile: ", halfPileSize);
                    marblesToRemove = input.nextInt();
                }
                while ((marblesToRemove != 1) && (marblesToRemove <= 0 || marblesToRemove > halfPileSize));
                
                sizeOfPile = sizeOfPile - marblesToRemove;
                System.out.printf("Size of pile after computer move is: %d\n", sizeOfPile);
                currentTurn = 0;
            }
            else {
                int countOfMarbles = 0;

                if (computerIntellect == 0) {
                    countOfMarbles = random.nextInt((sizeOfPile / 2)) + 1;
                }
                else if (computerIntellect == 1) {
                    if (sizeOfPile == 3 || sizeOfPile == 7 ||
                        sizeOfPile == 15 || sizeOfPile == 31 ||
                        sizeOfPile == 63) {
                        countOfMarbles = random.nextInt((sizeOfPile / 2)) + 1;
                    }
                    else {
                        if (sizeOfPile > 63) {
                            sizeOfPile = 63;
                        }
                        else if (sizeOfPile > 31) {
                            sizeOfPile = 31;
                        }
                        else if (sizeOfPile > 15) {
                            sizeOfPile = 15;
                        }
                        else if (sizeOfPile > 7) {
                            sizeOfPile = 7;
                        }
                        else if (sizeOfPile > 3) {
                            sizeOfPile = 3;
                        }
                    }
                }

                sizeOfPile = sizeOfPile - countOfMarbles;
                System.out.printf("Size of pile after computer move is: %d\n", sizeOfPile);
                currentTurn = 1;
            }
        }
        
        if (currentTurn == 0) {
            System.out.println("Computer wins!");
        }
        else {
            System.out.println("Human wins!");
        }

        input.close();
    }
}