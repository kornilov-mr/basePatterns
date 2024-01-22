package bridge;

public class ProgramCreator {
    public static void main(String[] args) {
        Program[] programs = {
                new BankingSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())
        };
        for(Program program : programs){
            program.developProgram();
        }
    }
}
