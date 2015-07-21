/*Complete the program in How To 4.1 on page 169. Your program should read twelve
temperature values and print the month with the highest temperature.*/

import java.util.Scanner;

public class P4_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double highestTemperature = input.nextDouble();
        int month = 1;

        for (int i = 1; i < 12; i++) {
            double newTemparature = input.nextDouble();
            if (newTemparature > highestTemperature) {
                highestTemperature = newTemparature;
                month = 1;
            }
        }

        System.out.printf("Month with highest temperature %.2f degrees is: %d", highestTemperature, month);

        input.close();
    }
}