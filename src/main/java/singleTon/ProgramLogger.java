package singleTon;


public class ProgramLogger {
    public static ProgramLogger programLogger;
    private String logFile= new String("This is log file");
    public static synchronized ProgramLogger getProgramLogger(){
        if(programLogger==null){
            programLogger=new ProgramLogger();
        }
        return programLogger;
    }
    private ProgramLogger(){

    }
    public void addInfo(String info){
        logFile+=info+"\n";
    }
    public void showLogs(){
        System.out.println(logFile);
    }
}
