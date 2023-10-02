package tdd;

public class User {

    String name;
    String password;

    public boolean isAuthenticate = false;
    public boolean isAdmin;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }


    public boolean authenticate(String name, String password) {
        this.isAuthenticate = this.name.equals(name) && this.password.equals(password);
        return this.isAuthenticate;
    }

    public boolean unAuthenticate() {
        isAuthenticate = false;
        return true;

    }


}