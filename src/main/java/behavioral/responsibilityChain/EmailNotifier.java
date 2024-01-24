package behavioral.responsibilityChain;

public class EmailNotifier extends Notifier{
    public EmailNotifier(int priority) {
        super(priority);
    }
    @Override
    public void write(String massage) {
        System.out.println("everything is okay");
    }
}
