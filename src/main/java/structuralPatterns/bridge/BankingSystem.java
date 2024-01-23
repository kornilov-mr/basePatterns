package structuralPatterns.bridge;

public class BankingSystem extends Program{
    protected BankingSystem(Developer developer){
        super(developer);
    }
    @Override
    public void developProgram() {
        System.out.println("Bank System in development");
        developer.writeCode();
    }
}
