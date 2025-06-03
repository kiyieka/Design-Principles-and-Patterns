package DependencyInversionPrinciple;


public class SMSService implements NotificationService {
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}

