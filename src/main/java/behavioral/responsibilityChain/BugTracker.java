package behavioral.responsibilityChain;

public class BugTracker {
    public static void main(String[] args) {
        Notifier simple = new SimpleNotifier(1);
        Notifier email = new EmailNotifier(2);
        Notifier Sms = new SMSNotifier(3);
        simple.setNextNotifier(email);
        email.setNextNotifier(Sms);
        simple.notifyManager("everything is okay",1);
        simple.notifyManager("everything is bad",2);
        simple.notifyManager("Asap",3);
    }
}
