/*Reimplement the Menu class so that it stores all menu items in one long string.
Hint: Keep a separate counter for the number of options. When a new option is
added, append the option count, the option, and a newline character.*/

import java.util.Scanner;

public class P8_03 {
    String options;
    int numberOfOptions;

    public P8_03() {
        this.options = "";
        this.numberOfOptions = 0;
    }

    public String getOptins() {
        return this.options;
    }

    public void addOptins(String option) {
        this.numberOfOptions++;
        this.options += String.format("%s%d|", option, this.numberOfOptions);
    }

    public void getInput() {
        Scanner console = new Scanner(System.in);
        int choice;

        do {
            System.out.print("Choice: ");
            choice = console.nextInt();
        } while (choice < 1 || choice > this.numberOfOptions);

        console.close();
    }
}