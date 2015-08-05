package emailsystem;

import java.io.FileNotFoundException;

import javax.swing.JFrame;

public class EmailSystemViewer {
    @SuppressWarnings("unused")
    public static void main(String[] args) throws FileNotFoundException {
        UsersDatabase usersDatabase = new UsersDatabase("12-ObjectOrientedDesign/emailsystem/users.txt");
        EmailSystem emailSystem = new EmailSystem(usersDatabase);
        JFrame loginFrame = new EmailSystemFrame(emailSystem);
    }
}