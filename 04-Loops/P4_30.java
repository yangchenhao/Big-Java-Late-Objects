/*Write an application to pre-sell a limited number of cinema tickets. Each buyer can
buy as many as 4 tickets. No more than 100 tickets can be sold. Implement a pro­gram
called TicketSeller that prompts the user for the desired number of tickets and
then displays the number of remaining tickets. Repeat until all tickets have been
sold, and then display the total number of buyers.*/

import java.util.Scanner;

public class P4_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfTickets = 100;
        int buyers = 0;
        
        while (numberOfTickets > 0) {
            int buyerTickets = 0;
            do {
                System.out.print("Enter number of tickets you want to buy: ");
                buyerTickets = input.nextInt();
            }
            while (buyerTickets > 4 || numberOfTickets - buyerTickets < 0);

            buyers++;

            numberOfTickets = numberOfTickets - buyerTickets;
            System.out.printf("Tickets left: %d\n", numberOfTickets);
        }
        
        System.out.printf("Number of buyers are: %d", buyers);
        input.close();
    }
}