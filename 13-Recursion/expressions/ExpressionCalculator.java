package expressions;

import java.util.Scanner;

public class ExpressionCalculator {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);
        System.out.println("Expression: ");
        String input = consoleIn.nextLine();
        consoleIn.close();

        Evaluator evaluator = new Evaluator(input);
        int value = evaluator.getExpressionValue();
        System.out.println(input + " = " + value);
    }
}