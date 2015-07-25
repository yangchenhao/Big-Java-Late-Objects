/*Write a program that prints a paycheck. Ask the program user for the name of the
employee, the hourly rate, and the number of hours worked. If the number of hours
exceeds 40, the employee is paid “time and a half”, that is, 150 percent of the hourly
rate on the hours exceeding 40. Use fictitious names for the payer and the bank. Be sure to use stepwi­se
refinement and break your solution into several methods. Use the intName method to
print the dollar amount of the check.*/

import java.util.Scanner;

public class P5_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter employee name: ");
        String name = input.nextLine();
        System.out.print("Please enter the hourly rate: ");
        double hourlyRate = input.nextDouble();
        System.out.print("Please enter the number of hours worked: ");
        int numberOfHours = input.nextInt();
        input.close();

        printInformation(name);
        double salary = totalSalary(numberOfHours, hourlyRate);
        printSalary(salary);
    }

    public static void printInformation(String name) {
        System.out.printf("Big Corp \t\t\t\t\tHSBC Bank\t\t\t\tCheckNumber: " + "4144\n");
        System.out.printf("8 St. \t\t\t\t\t\t341 Small St.\t\t\t\t\n");
        System.out.printf("Huston, NY 198813 \t\t\t\tCansas, AK 543210" + "\t\t\t\t%s\n", name);
        System.out.printf("\t\t\t\t\t\t\t\t\t\tDate:\t\tAmount:\n");
        System.out.printf("\t\t\t\t\t\t\t\t\t\t04/29/12\t$");
    }

    public static double totalSalary(int numberOfHours, double hourlyRate) {
        double employeeSalary = 0;
        if (numberOfHours > 40) {
            employeeSalary += (numberOfHours - 40) * hourlyRate * 1.5;
        }
        employeeSalary += numberOfHours * hourlyRate;

        return employeeSalary;
    }

    public static void printSalary(double salary) {
        System.out.printf("%.2f", salary);
    }
}