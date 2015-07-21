/*Mean and standard deviation. Write a program that reads a set of floating-point data
 values. Choose an appropriate mechanism for prompting for the end of the data set.
 When all values have been read, print out the count of the values, the aver age, and
 the standard deviation.*/

import java.util.Scanner;

public class P4_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a set of numbers: ");

        int countAllValues = 0;
        int sumAllValues = 0;
        double standartDeviation = 0;

        while (input.hasNextDouble()) {
            double number = input.nextDouble();
            standartDeviation += (number * number);
            sumAllValues += number;
            countAllValues++;
        }

        double average = sumAllValues / countAllValues;

        standartDeviation = standartDeviation - (1 / countAllValues) * Math.pow(sumAllValues, 2);
        standartDeviation = standartDeviation / (sumAllValues - 1);
        standartDeviation = Math.sqrt(standartDeviation);

        System.out.printf("Count of all values is: %d\n", countAllValues);
        System.out.printf("Average of all values is: %.2f\n", average);
        System.out.printf("Standart deviation of all values is: %.2f\n", standartDeviation);

        input.close();
    }
}