package expressions;

public class ExpressionTokenizer {
    private String input;
    private int start;
    private int end;

    public ExpressionTokenizer(String input) {
        this.input = input;
        this.start = 0;
        this.end = 0;
        this.nextToken();
    }

    public String peekToken() {
        if (this.start >= this.input.length()) {
            return null;
        } else {
            return this.input.substring(this.start, this.end);
        }
    }

    public String nextToken() {
        String r = this.peekToken();
        this.start = this.end;

        if (this.start >= this.input.length()) {
            return r;
        }

        if (Character.isDigit(this.input.charAt(this.start))) {
            this.end = this.start + 1;

            while (this.end < this.input.length() && Character.isDigit(this.input.charAt(this.end))) {
                this.end += 1;
            }
        } else {
            this.end = this.start + 1;
        }

        return r;
    }
}