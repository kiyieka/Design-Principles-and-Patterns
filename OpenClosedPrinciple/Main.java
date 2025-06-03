package OpenClosedPrinciple;


public class Main {
    public static void main(String[] args) {
        Notifier emailNotifier = new Notifier(new EmailNotification());
        emailNotifier.alert("Server is down!");

        Notifier smsNotifier = new Notifier(new SMSNotification());
        smsNotifier.alert("Battery low!");
    }
}


