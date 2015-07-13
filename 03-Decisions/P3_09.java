/*Write a program that reads a temperature value and the letter C for Celsius or F for
Fahrenheit. Print whether water is liquid, solid, or gaseous at the given temperature
at sea level.*/

import java.util.Scanner;

public class P3_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int BOIL_TEMPERATURE_AT_CELSIUS = 100;
        final int SOLID_TEMPERATURE_AT_CELSIUS = 0;
        final int BOIL_TEMPERATURE_AT_FAHRENHEIT = 134;
        final int SOLID_TEMPERATURE_AT_FAHRENHEIT = 34;

        int temperature = in.nextInt();
        char letter = in.next().toUpperCase().charAt(0);

        if (letter == 'C') {
            if (temperature < 0) {
                System.out.println("Solid");
            }
            else if (temperature >= SOLID_TEMPERATURE_AT_CELSIUS
                    && temperature <= BOIL_TEMPERATURE_AT_CELSIUS) {
                System.out.println("Liquid");
            }
            else if (temperature > BOIL_TEMPERATURE_AT_CELSIUS) {
                System.out.println("Gaseous");
            }
        }
        else if (letter == 'F') {
            if (temperature <= SOLID_TEMPERATURE_AT_FAHRENHEIT) {
                System.out.println("Solid");
            }
            else if (temperature > SOLID_TEMPERATURE_AT_FAHRENHEIT
                    && temperature < BOIL_TEMPERATURE_AT_FAHRENHEIT) {
                System.out.println("Liquid");
            }
            else if (temperature >= BOIL_TEMPERATURE_AT_FAHRENHEIT) {
                System.out.println("Gaseous");
            }
        }

        in.close();
    }
}