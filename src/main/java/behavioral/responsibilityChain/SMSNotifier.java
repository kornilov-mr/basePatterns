package behavioral.responsibilityChain;

public class SMSNotifier extends Notifier{
    public SMSNotifier(int priority) {
        super(priority);
    }
    @Override
    public void write(String massage) {
        System.out.println("sms send");
    }
}
