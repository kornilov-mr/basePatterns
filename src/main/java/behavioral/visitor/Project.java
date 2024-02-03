package behavioral.visitor;

public class Project implements ProjectElement{
    ProjectElement[] projectElements;
    public Project(){
        this.projectElements = new ProjectElement[]{
                new ProjectClass(),
                new DateBase(),
                new Test(),
        };
    }
    @Override
    public void beWritten(Developer developer) {
        for(ProjectElement project : projectElements){
            project.beWritten(developer);
        }
    }
}
