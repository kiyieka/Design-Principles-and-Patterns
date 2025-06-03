package DependencyInversionPrinciple;

public class App {
    private final NotificationService service;

    // App depends on abstraction, not a specific class
    public App(NotificationService service) {
        this.service = service;
    }

    public void notifyUser(String message) {
        service.send(message);
    }
}


