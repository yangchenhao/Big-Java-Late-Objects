/*The System.out.printf method has predefined formats for printing integers,  floating-point
numbers, and other data types. But it is also extensible. If you use the S for­mat, you can
print any class that implements the Formattable interface. That interface has a single method:
void formatTo(Formatter formatter, int flags, int width, int precision)
In this exercise, you should make the BankAccount class implement the Formattable
interface. Ignore the flags and precision and simply format the bank balance, using
the given width. In order to achieve this task, you need to get an Appendable reference
like this:
Appendable a = formatter.out();
Appendable is another interface with a method
void append(CharSequence sequence)
CharSequence is yet another interface that is implemented by (among others) the String
class. Construct a string by first converting the bank balance into a string and then
padding it with spaces so that it has the desired width. Pass that string to the append
method.

Enhance the formatTo method of Exercise P9.18 by taking into account the precision.*/

import java.io.IOException;
import java.util.Formattable;
import java.util.Formatter;
import java.util.Scanner;

public class BankAccount implements Formattable {
    private double balance;

    public BankAccount(double balance) {
        this.setBalance(balance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void formatTo(Formatter formatter, int flags, int width, int precision) {
        Appendable a = formatter.out();

        double roundedBalance = Math.round(this.getBalance());
        String balanceString = Double.toString(roundedBalance);

        Scanner getDecimalParts = new Scanner(balanceString);
        getDecimalParts.useDelimiter("\\.");
        String realPart = getDecimalParts.next();
        String fractionalPart = getDecimalParts.next();
        getDecimalParts.close();

        if (precision == 0) {
            balanceString = realPart;
        } else {
            int addZeros = fractionalPart.length();
            while (addZeros < precision) {
                balanceString += "0";
                addZeros++;
            }
        }

        while (width > balanceString.length()) {
            balanceString = " " + balanceString;
        }

        try {
            a.append(balanceString);
        } catch (IOException ioex) {
            System.out.println("Error with appending!");
        }
    }
}