package structuralPatterns.facade;

public class BugTracker {
    private Boolean activeSprint;

    public boolean isActive(){
        return activeSprint;
    }
    public void startSprint(){
        System.out.println("Sprint started");
        activeSprint=true;
    }
    public void stopSprint(){
        System.out.println("Sprint stopped");
        activeSprint=false;
    }

}
