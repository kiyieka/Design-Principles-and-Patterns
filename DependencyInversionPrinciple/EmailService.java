package DependencyInversionPrinciple;


public class EmailService implements NotificationService {
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}

