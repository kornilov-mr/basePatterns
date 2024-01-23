package facade;

public class WorkFlow {
    private Developer developer = new Developer();
    private Job job = new Job();
    private BugTracker bugTracker = new BugTracker();

    public void SolveProblem(){
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadLine(bugTracker);
    }
}
