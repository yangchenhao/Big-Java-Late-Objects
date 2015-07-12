/*
A video club wants to reward its best members with a discount based on the mem-
ber’s number of movie rentals and the number of new members referred by the
member. The discount is in percent and is equal to the sum of the rentals and the
referrals, but it cannot exceed 75 percent. (Hint: Math.min .) Write a program Discount-
Calculator to calculate the value of the discount.
Here is a sample run:
Enter the number of movie rentals: 56
Enter the number of members referred to the video club: 3
The discount is equal to:     59.00 percent.
*/

import java.util.Scanner;

public class P2_27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of movie rentals: \n");
        int movieRentals = in.nextInt();
        System.out.print("Enter the number of members referred to the video club: \n");
        int referredMembers = in.nextInt();

        int percents = Math.min(movieRentals + referredMembers, 75);
        System.out.printf("The discount is equal to: %d percent", percents);
        
        in.close();
    }
}