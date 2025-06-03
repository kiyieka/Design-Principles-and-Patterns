package OpenClosedPrinciple;


public class Notifier {
    private final Notification notification;

    public Notifier(Notification notification) {
        this.notification = notification;
    }

    public void alert(String message) {
        notification.send(message);
    }
}

