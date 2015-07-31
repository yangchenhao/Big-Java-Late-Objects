/*Modify the checkAnswer method of the Question class so that it does not take into
account different spaces or upper/lowercase characters. For example, the response
"JAMES gosling" should match an answer of "James Gosling" .
Provide toString methods for the Question and ChoiceQuestion classes.*/

public class Question {
    private String text;
    private String answer;

    public Question() {
        this.text = "";
        this.answer = "";
    }

    public String getText() {
        return this.text;
    }

    public void setText(String questionText) {
        this.text = questionText;
    }

    public String getAnswer() {
        return this.answer;
    }

    public void setAnswer(String correctResponse) {
        this.answer = correctResponse;
    }

    public boolean checkAnswer(String response) {
        String realAnswer = this.getAnswer().trim().toLowerCase();
        String responseAnswer = response.trim().toLowerCase();

        return realAnswer.equals(responseAnswer);
    }

    public void display() {
        System.out.println(this.text);
    }

    public String toString() {
        return getClass().getName();
    }
}