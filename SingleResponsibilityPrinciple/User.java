package SingleResponsibilityPrinciple;

//SingleResponsibilityPrinciple.User class is only responsible for holding user data.
public class User {
    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}
