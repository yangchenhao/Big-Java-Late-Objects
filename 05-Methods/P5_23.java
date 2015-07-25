/*Write a program that prints instructions to get coffee, asking the user for input
 whenever a decision needs to be made. Decompose each task into a method, for example:
 public static void brewCoffee()
 {
 System.out.println(“Add water to the coffee maker.”);
 System.out.println(“Put a filter in the coffee maker.”);
 grindCoffee();
 System.out.println(“Put the coffee in the filter.”);
 . . .
 }*/

import java.util.Scanner;

public class P5_23 {
    public static void main(String[] args) {
        isMaded();
    }

    public static void isMaded() {
        System.out.println("Is there made coffee?(Yes/No)");
        Scanner input = new Scanner(System.in);
        String answer = input.next();
        input.close();

        if (answer.equals("No")) {
            System.out.println("You must make coffee.");
            makeCoffee();
        } else {
            System.out.println("You can drink your coffee!.");
        }
    }

    public static void makeCoffee() {
        System.out.println("Is there instant coffee available? (Yes/No)");
        Scanner input = new Scanner(System.in);
        String answer = input.next();
        input.close();

        if (answer.equals("Yes")) {
            boilWater();
            System.out.println("Mix boiling water with instant coffee.");
        } else {
            brewCoffee();
        }
    }

    public static void boilWater() {
        System.out.println("Is there a microwave available? (Yes/No) ");
        Scanner input = new Scanner(System.in);
        String answer = input.next();
        input.close();

        if (answer.equals("Yes")) {
            System.out.println("Fill cup with water.");
            System.out.println("Place cup in microwave.");
            System.out.println("Heat for three minutes.");
        } else {
            System.out.println("Fill a kettle with water.");
            System.out.println("Heat kettle on stove until water comes to a boil.");
        }
    }

    public static void brewCoffee() {
        System.out.println("Add water to the coffee maker.");
        System.out.println("Put a filter in coffee maker.");
        System.out.println("Add coffee beans to the coffee grinder.");
        System.out.println("Push the button for 60 seconds.");
        System.out.println("Add coffee beans to filer.");
        System.out.println("Trun coffee maker on.");
    }
}