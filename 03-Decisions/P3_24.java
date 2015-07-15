/*Unit conversion. Write a unit conversion program that asks the users from which
unit they want to convert (fl. oz, gal, oz, lb, in, ft, mi) and to which unit they want to
convert (ml, l, g, kg, mm, cm, m, km). Reject incompatible conversions
(such as gal → km). Ask for the value to be converted, then display the result:
Convert from? gal
Convert to? ml
Value? 2.5
2.5 gal = 9462.5 ml*/

import java.util.Scanner;

public class P3_24 {
    public static void main(String[] args) {
        final double MILLILITER_PER_FL = 29.5735296875;
        final double LITER_PER_FL = 0.0295735296875;

        final double MILLILITER_PER_GAL = 3785.41178;
        final double LITER_PER_GAL = 3.78541178;

        final double GRAM_PER_OZ = 28.3495231;
        final double KILOGRAM_PER_OZ = 0.0283495231;

        final double GRAM_PER_LB = 453.59237;
        final double KILOGRAM_PER_LB = 0.45359237;

        final double MILLIMETER_PER_INCH = 25.4;
        final double CENTIMETER_PER_INCH = 2.54;
        final double METER_PER_INCH = 0.0254;
        final double KILOMETER_PER_INCH = 2.54E-5;

        final double MILLIMETER_PER_FEET = 304.8;
        final double CENTIMETER_PER_FEET = 30.48;
        final double METER_PER_FEET = 0.3048;
        final double KILOMETER_PER_FEET = 0.0003048;

        final double MILLIMETER_PER_MILE = 1609344;
        final double CENTIMETER_PER_MILE = 160934.4;
        final double METER_PER_MILE = 1609.344;
        final double KILOMETER_PER_MILE = 1.609344;

        Scanner input = new Scanner(System.in);

        System.out.print("Convert from? (fl. oz, gal, oz, lb, in, ft, mi)");
        String convertFrom = input.next().toLowerCase();

        System.out.print("Convert to? (ml, l, g, kg, mm, cm, m, km)");
        String convertTo = input.next().toLowerCase();

        System.out.println("Value?");
        double value = input.nextDouble();

        input.close();

        double convertedValue = 0;
        if (convertFrom.equals("fl")) {
            if (convertTo.equals("ml")) {
                convertedValue = value * MILLILITER_PER_FL;
            }
            else if (convertTo.equals("l")) {
                convertedValue = value * LITER_PER_FL;
            }
            else {
                System.out.println("Error with units");
            }
        }
        else if (convertFrom.equals("gal")) {
            if (convertTo.equals("ml")) {
                convertedValue = value * MILLILITER_PER_GAL;
            }
            else if (convertTo.equals("l")) {
                convertedValue = value * LITER_PER_GAL;
            }
            else {
                System.out.println("Error with units");
            }
        }
        else if (convertFrom.equals("oz")) {
            if (convertTo.equals("g")) {
                convertedValue = value * GRAM_PER_OZ;
            }
            else if (convertTo.equals("kg")) {
                convertedValue = value * KILOGRAM_PER_OZ;
            }
            else {
                System.out.println("Error with units");
            }
        }
        else if (convertFrom.equals("lb")) {
            if (convertTo.equals("g")) {
                convertedValue = value * GRAM_PER_LB;
            }
            else if (convertTo.equals("kg")) {
                convertedValue = value * KILOGRAM_PER_LB;
            }
            else {
                System.out.println("Error with convert to units");
            }
        }
        else if (convertFrom.equals("in")) {
            if (convertTo.equals("mm")) {
                convertedValue = value * MILLIMETER_PER_INCH;
            }
            else if (convertTo.equals("cm")) {
                convertedValue = value * CENTIMETER_PER_INCH;
            }
            else if (convertTo.equals("m")) {
                convertedValue = value * METER_PER_INCH;
            }
            else if (convertTo.equals("km")) {
                convertedValue = value * KILOMETER_PER_INCH;
            }
            else {
                System.out.println("Error with convert to units");
            }
        }
        else if (convertFrom.equals("ft")) {
            if (convertTo.equals("mm")) {
                convertedValue = value * MILLIMETER_PER_FEET;
            }
            else if (convertTo.equals("cm")) {
                convertedValue = value * CENTIMETER_PER_FEET;
            }
            else if (convertTo.equals("m")) {
                convertedValue = value * METER_PER_FEET;
            }
            else if (convertTo.equals("km")) {
                convertedValue = value * KILOMETER_PER_FEET;
            }
            else {
                System.out.println("Error with convert to units");
            }
        }
        else if (convertFrom.equals("mi")) {
            if (convertTo.equals("mm")) {
                convertedValue = value * MILLIMETER_PER_MILE;
            }
            else if (convertTo.equals("cm")) {
                convertedValue = value * CENTIMETER_PER_MILE;
            }
            else if (convertTo.equals("m")) {
                convertedValue = value * METER_PER_MILE;
            }
            else if (convertTo.equals("km")) {
                convertedValue = value * KILOMETER_PER_MILE;
            }
            else {
                System.out.println("Error with convert to units");
            }
        }
        else {
            System.out.println("Error with convert from units");
            return;
        }

        System.out.printf("%.2f %s = %.2f 5s", value, convertFrom, convertedValue, convertTo);
    }
}