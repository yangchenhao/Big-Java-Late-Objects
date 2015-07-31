/*Provide toString methods for the Question and ChoiceQuestion classes.*/

import java.util.ArrayList;

public class ChoiceQuestion extends Question {
    private ArrayList<String> choices;

    public ChoiceQuestion() {
        super();
        choices = new ArrayList<String>();
    }

    public ArrayList<String> getChoices() {
        return this.choices;
    }

    public void setChoice(String choice) {
        this.choices.add(choice);
    }

    public void addChoice(String choice, boolean correct) {
        setChoice(choice);
        if (correct) {
            setAnswer(choice);
        }
    }

    public void display() {
        super.display();
        for (int i = 0; i < choices.size(); i++) {
            int choiceNumber = i + 1;
            System.out.println(choiceNumber + ": " + choices.get(i));
        }
    }

    public String toString() {
        return getClass().getName();
    }
}