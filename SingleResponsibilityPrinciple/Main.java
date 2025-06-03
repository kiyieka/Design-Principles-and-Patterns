package SingleResponsibilityPrinciple;

public class Main {
    public static void main(String[] args) {
        User user = new User("john_doe", "john@xaple.com");
        UserPersistence persistence = new UserPersistence();

        persistence.saveUser(user);
    }
}
