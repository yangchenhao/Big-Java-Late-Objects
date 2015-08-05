package emailsystem;

public class Email {
    private String sender;
    private String recipient;
    private String title;
    private String text;

    public Email(String recipient, String sender, String title, String text) {
        this.recipient = recipient;
        this.sender = sender;
        this.title = title;
        this.text = text;
    }

    public String getSender() {
        return this.sender;
    }

    public String getRecipient() {
        return this.recipient;
    }

    public String getTitle() {
        return this.title;
    }

    public String getText() {
        return this.text;
    }

    public boolean match(String title) {
        return this.title.equals(title);
    }
}