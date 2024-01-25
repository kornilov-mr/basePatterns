package behavioral.interpretator;

public class InterpretatorRunner {
    public static void main(String[] args) {
        Expression javaExpression= getJavaExpression();
        Expression javaSpringExpression= getJavaEEExpression();
        System.out.println(javaExpression.interpret("java core"));
        System.out.println(javaSpringExpression.interpret("java spring"));
    }
    public static Expression getJavaExpression(){
        Expression java = new TerminalExpression("java");
        Expression javaCore = new TerminalExpression("java Core");

        return new OrExpression(java,javaCore);
    }
    public static Expression getJavaEEExpression(){
        Expression java = new TerminalExpression("java");
        Expression javaSpring = new TerminalExpression("spring");

        return new AndExpression(java,javaSpring);
    }
}
