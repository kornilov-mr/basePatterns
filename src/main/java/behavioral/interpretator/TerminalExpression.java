package behavioral.interpretator;

public class TerminalExpression implements Expression{
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String content) {
        if (content.contains(data)){
            return true;
        }
        return false;
    }
}
