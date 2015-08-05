package expressions;

public class Evaluator {
    private ExpressionTokenizer tokenizer;

    public Evaluator(String expression) {
        this.tokenizer = new ExpressionTokenizer(expression);
    }

    public int getExpressionValue() {
        int value = this.getTermValue();
        boolean done = false;

        while (!done) {
            String next = this.tokenizer.peekToken();

            if ("+".equals(next) || "-".equals(next)) {
                this.tokenizer.nextToken();
                int value2 = this.getTermValue();

                if ("+".equals(next)) {
                    value += value2;
                } else {
                    value -= value2;
                }
            } else {
                done = true;
            }
        }

        return value;
    }

    public int getTermValue() {
        int value = this.getFactorValue();
        boolean done = false;

        while (!done) {
            String next = this.tokenizer.peekToken();

            if ("*".equals(next) || "/".equals(next)) {
                this.tokenizer.nextToken();
                int value2 = this.getFactorValue();

                if ("*".equals(next)) {
                    value *= value2;
                } else {
                    value /= value2;
                }
            } else {
                done = true;
            }
        }

        return value;
    }

    public int getFactorValue() {
        int value;
        String next = this.tokenizer.peekToken();

        while (next.equals(" ")) {
            this.tokenizer.nextToken();
            next = this.tokenizer.peekToken();
        }

        if (next.equals("(")) {
            this.tokenizer.nextToken();
            value = this.getExpressionValue();
            this.tokenizer.nextToken();
        } else {
            value = Integer.parseInt(this.tokenizer.nextToken());
        }

        return value;
    }
}