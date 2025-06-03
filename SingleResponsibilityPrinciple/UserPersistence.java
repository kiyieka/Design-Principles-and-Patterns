package SingleResponsibilityPrinciple;

// SingleResponsibilityPrinciple.UserPersistence class is only responsible for saving that data
// Changes to how users are saved (like switch to a different database) only affect SingleResponsibilityPrinciple.UserPersistence.
public class UserPersistence {
    public void saveUser(User user) {
        // For demonstration, we'll just print to console.
        System.out.println("Saving user to database...");
        System.out.println("Username: " + user.getUsername());
        System.out.println("Email: " + user.getEmail());
    }
}
