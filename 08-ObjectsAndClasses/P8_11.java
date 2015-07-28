/*Provide a class for authoring a simple letter. In the constructor, supply the names of
the sender and the recipient:
public Letter(String from, String to)
Supply a method
public void addLine(String line)
to add a line of text to the body of the letter. Supply a method
public String getText()
that returns the entire text of the letter. The text has the form:
Dear recipient name :
blank line
first line of the body
second line of the body
last line of the body
blank line
Sincerely,
blank line
sender name
Also supply a main method that prints this letter.
Dear John:
I am sorry we must part.
I wish you all the best.
Sincerely,
Mary
Construct an object of the Letter class and call addLine twice.*/

public class P8_11 {
    private String from;
    private String to;
    private String text;

    public P8_11(String from, String to) {
        this.from = from;
        this.to = to;
        this.text = "";
    }

    public void addLine(String line) {
        this.text += String.format("%s\n", line);
    }

    public String getText() {
        return String.format("Dear %s\n\n%s\nSincerely,\n\n%s", this.from, this.text, this.to);
    }

    public static void main(String[] args) {
        P8_11 letter = new P8_11("John", "Mary");
        letter.addLine("I am sorry we must part.");
        letter.addLine("I wish you all the best.");
        System.out.println(letter.getText());
    }
}