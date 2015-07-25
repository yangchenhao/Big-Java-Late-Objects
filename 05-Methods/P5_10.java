/*Write a method
public static double readDouble(String prompt)
that displays the prompt string, followed by a space, reads a floating-point number
in, and returns it. Here is a typical usage:
salary = readDouble("Please enter your salary:");
percentageRaise = readDouble("What percentage raise would you like?");*/

import java.util.Scanner;

public class P5_10 {
    public static void main(String[] args){
        double salary = readDouble("Please enter your salary: ");
        double percentageRaise = readDouble("What percentage raise would you like?");
        
        System.out.printf("Salary is: %.2f", salary);
        System.out.printf("Salary is: %.2f", percentageRaise);
    }
    
    public static double readDouble(String prompt){
        System.out.println(prompt);
        
        Scanner input = new Scanner(System.in);
        double value = input.nextDouble();
        input.close();
        
        return value;
    }
}