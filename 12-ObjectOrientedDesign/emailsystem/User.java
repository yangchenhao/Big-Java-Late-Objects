package emailsystem;

public class User {
    private String name;
    private String password;
    private String emailAddress;
    private EmailBox emailBox;

    public User(String name, String password, String emailAddress) {
        this.name = name;
        this.password = password;
        this.emailAddress = emailAddress;
        this.emailBox = new EmailBox();
    }

    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public EmailBox getEmailBox() {
        return this.emailBox;
    }

    public boolean match(String name) {
        return this.name.equals(name);
    }

    public boolean match(String name, String password) {
        return this.name.equals(name) && this.password.equals(password);
    }
}