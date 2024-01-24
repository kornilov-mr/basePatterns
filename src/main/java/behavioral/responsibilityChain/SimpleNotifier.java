package behavioral.responsibilityChain;

public class SimpleNotifier extends Notifier{
    public SimpleNotifier(int priority) {
        super(priority);
    }
    @Override
    public void write(String massage) {
        System.out.println("email send");
    }
}
