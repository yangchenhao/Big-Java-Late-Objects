/*You need to control the number of people who can be in an oyster bar at the same
time. Groups of people can always leave the bar, but a group cannot enter the bar
if they would make the number of people in the bar exceed the maximum of 100
occupants. Write a program that reads the sizes of the groups that arrive or depart.
Use negative numbers for departures. After each input, display the current number
of occupants. As soon as the bar holds the maximum number of people, report that
the bar is full and exit the program.*/

import java.util.Scanner;

public class P4_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maxOccupants = 100;
        int currentOccupants = 0;
        while (currentOccupants < maxOccupants) {
            System.out.print("Enter size of group that arrive or depart: ");
            int size = input.nextInt();
            currentOccupants += size;
            System.out.printf("Current occupants are: %d\n", currentOccupants);
        }

        System.out.println("The bar is already full!");
        input.close();
    }
}