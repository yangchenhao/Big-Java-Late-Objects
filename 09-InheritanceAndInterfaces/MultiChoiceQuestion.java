/*Add a class MultiChoiceQuestion to the question hierarchy of Section 9.1 that allows
multiple correct choices. The respondent should provide all correct choices, sepa­rated
by spaces. Provide instructions in the question text.*/

public class MultiChoiceQuestion extends ChoiceQuestion {
    public MultiChoiceQuestion() {
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

    public void display() {
        super.display();
        System.out.println("Provide everyone of correct answers!");
        System.out.println("If they are more than one provide them separated with spaces!");
    }
}