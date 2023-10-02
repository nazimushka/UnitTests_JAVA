package tdd;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    public List<User> data = new ArrayList<>();

    public void addUser(User user) {
        //..
        data.add(user);
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }


    public void unLoginAllUsersExceptAdmin() {
        for (User user : data) {
            if (!user.isAdmin)
                user.unAuthenticate();
        }
    }

    public boolean authenticateUser(String username, String password) {
        if (findByName(username)) {
            for (User user : data) {
                if (user.name.equals(username)) {
                    return user.authenticate(username, password);
                }
            }
        }

        return false;
    }
}