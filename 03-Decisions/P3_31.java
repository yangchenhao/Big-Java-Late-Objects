/*Write a program that reads in the name and salary of an employee. Here the salary
 will denote an hourly wage, such as $9.25. Then ask how many hours the employee
 worked in the past week. Be sure to accept fractional hours. Compute the pay. Any
 overtime work (over 40 hours per week) is paid at 150 percent of the regular wage.
 Print a paycheck for the employee.*/

import java.util.Scanner;

public class P3_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Employee name: ");
        String name = input.nextLine();
        System.out.println("Employee salary: ");
        double salary = input.nextDouble();
        System.out.println("How many hours employee work last week: ");
        double hours = input.nextDouble();

        input.close();

        double payment = 0;

        if (hours > 40) {
            payment = 1.5 * salary * (hours - 40) + 40 * salary;
        }
        else {
            payment = salary * hours;
        }

        System.out.printf("Pay for %s is %.2f", name, payment);
    }
}