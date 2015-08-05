package emailsystem;

import java.util.List;

public class EmailSystem {
    private UsersDatabase usersDB;
    private User currentUser;

    private int state;
    protected static final int START_STATE = 1;
    protected static final int ACCOUNT_STATE = 2;
    protected static final int WRITE_EMAIL_STATE = 3;
    protected static final int READ_RECEIVED_EMAILS_STATE = 4;
    protected static final int READ_SENT_EMAILS_STATE = 5;

    public EmailSystem(UsersDatabase usersDB) {
        this.usersDB = usersDB;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void sendEmail(String recipientName, Email email) {
        User recipientUser = this.usersDB.findUser(recipientName);

        if (recipientUser != null) {
            EmailBox currentUserEmailBox = currentUser.getEmailBox();
            currentUserEmailBox.sendEmail(email);
            EmailBox recipientMailbox = recipientUser.getEmailBox();
            recipientMailbox.receiveEmail(email);
        }
    }

    public boolean canLoginUser(String username, String password) {
        User possibleUser = this.usersDB.findUser(username, password);

        if (possibleUser != null) {
            this.currentUser = possibleUser;
            return true;
        }

        return false;
    }

    public Email getMatchingEmail(String title, List<Email> emails) {
        for (Email email : emails) {
            if (email.match(title)) {
                return email;
            }
        }

        return null;
    }

    public int getState() {
        return this.state;
    }

    public void setState(int state) {
        this.state = state;
    }
}