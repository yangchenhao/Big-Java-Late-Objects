/*Write a program that reads a file containing two columns of floating-point ­numbers.
Prompt the user for the file name. Print the average of each column.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P7_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter file name: ");
        String fileName = input.next();
        input.close();

        File file = new File(fileName);
        Scanner in = null;

        try {
            in = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exist!");
        }

        double firstColumnSum = 0;
        double secondColumnSum = 0;
        int allRows = 0;
        while (in.hasNextLine()) {
            String[] row = in.nextLine().split("\\s+");
            firstColumnSum += Double.parseDouble(row[0]);
            secondColumnSum += Double.parseDouble(row[1]);
            allRows++;
        }
        
        in.close();

        System.out.printf("First column sum is: %.2f\n", firstColumnSum / allRows);
        System.out.printf("Second column sum is: %.2f\n", secondColumnSum / allRows);
    }
}