/*Write a program that reads a temperature value and the letter C for Celsius or F for
Fahrenheit. Print whether water is liquid, solid, or gaseous at the given temperature
at sea level.*/

import java.util.Scanner;

public class P3_09 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int temperature = in.nextInt();
        char letter = in.next().toUpperCase().charAt(0);
        
        if (letter == 'C') {
            if (temperature < 0) {
                System.out.println("Solid");
            }
            else if (temperature >= 0 && temperature <= 100) {
                System.out.println("Liquid");
            }
            else if (temperature > 100) {
                System.out.println("Gaseous");
            }
        }
        else if (letter == 'F') {
            if (temperature <= 32) {
                System.out.println("Solid");
            }
            else if (temperature > 32 && temperature < 132) {
                System.out.println("Liquid");
            }
            else if (temperature >= 132) {
                System.out.println("Gaseous");
            }
        }
        
        in.close();
    }
}