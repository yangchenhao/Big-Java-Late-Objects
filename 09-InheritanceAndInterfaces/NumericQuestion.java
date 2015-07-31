/*Add a class NumericQuestion to the question hierarchy of Section 9.1. If the response
and the expected answer differ by no more than 0.01, then accept the response as
correct.*/

public class NumericQuestion extends Question {
    public NumericQuestion() {
        super();
    }

    public boolean checkAnswer(String response) {
        double expectedAnswer = Double.parseDouble(this.getAnswer());
        double responseAnswer = Double.parseDouble(response);

        return Math.abs(expectedAnswer - responseAnswer) <= 0.01;
    }
}