package singleTon;

public class programRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addInfo("first log");
        ProgramLogger.getProgramLogger().addInfo("second log");
        ProgramLogger.getProgramLogger().addInfo("third log");

        ProgramLogger.getProgramLogger().showLogs();
    }
}
