package emailsystem;

import java.util.ArrayList;
import java.util.List;

public class EmailBox {
    private List<Email> sentEmails;
    private List<Email> receivedEmails;

    public EmailBox() {
        this.sentEmails = new ArrayList<Email>();
        this.receivedEmails = new ArrayList<Email>();
    }

    public List<Email> getSentEmails() {
        return this.sentEmails;
    }

    public List<Email> getReceivedEmails() {
        return this.receivedEmails;
    }

    public void receiveEmail(Email email) {
        this.receivedEmails.add(email);
    }

    public void sendEmail(Email email) {
        this.sentEmails.add(email);
    }
}