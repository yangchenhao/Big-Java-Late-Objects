/*Add a class FillInQuestion to the question hierarchy of Section 9.1. Such a question is
constructed with a string that contains the answer, surrounded by _ _ , for exam­ple,
"The inventor of Java was _James Gosling_" . The question should be displayed as
The inventor of Java was _____*/

import java.util.Scanner;

public class FillInQuestion extends Question {
    public FillInQuestion() {
        super();
    }

    public void constructQuestionAndAnswer(String questionText) {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        parser.close();

        question += " ";
        for (int i = 0; i < answer.length(); i++) {
            question += "_ ";
        }

        this.setText(question);
        this.setAnswer(answer);
    }
}