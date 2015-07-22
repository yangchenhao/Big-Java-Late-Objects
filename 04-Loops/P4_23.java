/*The Drunkard’s Walk. A drunkard in a grid of streets randomly picks one of four
directions and stumbles to the next intersection, then again randomly picks one of
four directions, and so on. You might think that on average the drunkard doesn’t
move very far because the choices cancel each other out, but that is actually not the case.
Represent locations as integer pairs (x, y). Implement the drunkard’s walk over 100
intersections, starting at (0, 0), and print the ending location.*/

import java.util.Random;
import java.util.Scanner;

public class P4_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int startingX = 0;
        int startingY = 0;

        System.out.print("Please enter number of steps: ");
        int steps = input.nextInt();

        for (int i = 0; i < steps; i++) {
            int direction = random.nextInt(4) + 1;
            if (direction == 1) {
                startingX += 1;
            }
            else if (direction == 2) {
                startingY += 1;
            }
            else if (direction == 3) {
                startingX -= 1;
            }
            else if (direction == 4) {
                startingY -= 1;
            }
        }

        System.out.printf("End point is: (%d, %d)", startingX, startingY);

        input.close();
    }
}