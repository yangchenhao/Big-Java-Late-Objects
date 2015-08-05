package emailsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsersDatabase {
    private List<User> users;

    public UsersDatabase(String filename) throws FileNotFoundException {
        this.users = new ArrayList<User>();
        this.readUsers(filename);
    }

    public void readUsers(String filename) throws FileNotFoundException {
        Scanner fileIn = new Scanner(new File(filename));

        while (fileIn.hasNext()) {
            String username = fileIn.next();
            String password = fileIn.next();
            String email = fileIn.next();

            User currentUser = new User(username, password, email);
            this.addUser(currentUser);
        }

        fileIn.close();
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public User findUser(String username) {
        for (User user : this.users) {
            if (user.match(username)) {
                return user;
            }
        }

        return null;
    }

    public User findUser(String username, String password) {
        for (User user : this.users) {
            if (user.match(username, password)) {
                return user;
            }
        }

        return null;
    }
}