package DependencyInversionPrinciple;


public class Main {
    public static void main(String[] args) {
        NotificationService email = new EmailService();
        App app1 = new App(email);
        app1.notifyUser("Welcome via Email!");

        NotificationService sms = new SMSService();
        App app2 = new App(sms);
        app2.notifyUser("Welcome via SMS!");
    }
}

