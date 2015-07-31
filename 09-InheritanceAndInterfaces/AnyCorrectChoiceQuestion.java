/*Add a class AnyCorrectChoiceQuestion to the question hierarchy of Section 9.1 that
allows multiple correct choices. The respondent should provide any one of the cor­rect
choices. The answer string should contain all of the correct choices, separated by
spaces. Provide instructions in the question text.*/

public class AnyCorrectChoiceQuestion extends ChoiceQuestion {
    public AnyCorrectChoiceQuestion() {
        super();
    }

    public void setAnswer(String correctResponse) {
        String newAnswers = getAnswer();
        newAnswers += correctResponse + " ";
        super.setAnswer(newAnswers);
    }

    public void addChoice(String choice, boolean correct) {
        super.setChoice(choice);
        if (correct) {
            setAnswer(choice);
        }
    }

    public boolean checkAnswer(String response) {
        return this.getAnswer().trim().toLowerCase().contains(response.trim().toLowerCase());
    }

    public void display() {
        super.display();
        System.out.println("Provide anyone of correct answers!");
        System.out.println("If they are more than one provide them separated with spaces!");
    }
}