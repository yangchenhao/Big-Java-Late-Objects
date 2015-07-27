/*A theater seating chart is implemented as a two-dimensional array of ticket prices,
 like this:
 10 10 10 10 10 10 20 20 30 10
 10 10 10 10 10 20 30 40 10 10
 10 20 20 20 30 30 50 10 10 10
 20 20 20 30 40 50 10 10 10 20
 20 20 40 50 50 10 10 10 20 20
 20 40 50 50 10 10 10 20 20 20
 30 40 50 10 10 10 20 20 20 30
 30 50 10 10 10 10 10 10 20 30
 40 10 10 10 10 10 10 20 20 30
 Write a program that prompts users to
 pick either a seat or a price. Mark sold
 seats by changing the price to 0. When
 a user specifies a seat, make sure it is
 available. When a user specifies a price,
 find any seat with that price.*/

import java.util.Scanner;

public class P6_24 {
    public static void main(String[] args) {
        int[][] prices = new int[][] {
                { 10, 10, 10, 10, 10, 10, 20, 20, 30, 10 },
                { 10, 10, 10, 10, 10, 20, 30, 40, 10, 10 },
                { 10, 20, 20, 20, 30, 30, 50, 10, 10, 10 },
                { 20, 20, 20, 30, 40, 50, 10, 10, 10, 20 },
                { 20, 20, 40, 50, 50, 10, 10, 10, 20, 20 },
                { 20, 40, 50, 50, 10, 10, 10, 20, 20, 20 },
                { 30, 40, 50, 10, 10, 10, 20, 20, 20, 30 },
                { 30, 50, 10, 10, 10, 10, 10, 10, 20, 30 },
                { 40, 10, 10, 10, 10, 10, 10, 20, 20, 30 } 
        };

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter (seat or price): ");
        String choose = input.next();

        while (!(choose.equals("seat") || choose.equals("price"))) {
            System.out.print("Please enter (seat or price): ");
            choose = input.next();
        }

        boolean isSold = false;
        while (!isSold) {
            if (choose.equals("seat")) {
                System.out.print("Please choose row: ");
                int row = input.nextInt();
                System.out.print("Please choose column: ");
                int column = input.nextInt();

                if (prices[row][column] != 0) {
                    isSold = true;
                    prices[row][column] = 0;
                    System.out.println("This seat is empty! You got it!");
                } else {
                    System.out.println("This seat is not empty! Pick another one!");
                }
            } else if (choose.equals("price")) {
                System.out.print("Plese choose price: ");
                int price = input.nextInt();
                
                for (int i = 0; i < prices.length; i++) {
                    for (int j = 0; j < prices[i].length; j++) {
                        if (prices[i][j] == price) {
                            isSold = true;
                            prices[i][j] = 0;
                            System.out.printf("This seat [%d, %d] is empty! You got it!\n", i, j);
                            break;
                        }
                    }
                    
                    if (isSold) {
                        break;
                    }
                }

                if (!isSold) {
                    System.out.println("Please pick another price!");
                }
            }
        }

        System.out.println("Goodbye! Have a nice day!");
        input.close();
    }
}