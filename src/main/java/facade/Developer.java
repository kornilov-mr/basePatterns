package facade;

public class Developer {
    public void doJobBeforeDeadLine(BugTracker bugTracker){
        if(bugTracker.isActive()){
            System.out.println("Developer is solving the problem");
        }else{
            System.out.println("Developer doesn't do shit");
        }

    }
}
