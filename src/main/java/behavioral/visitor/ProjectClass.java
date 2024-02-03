package behavioral.visitor;

import behavioral.visitor.Developer;

public class ProjectClass implements ProjectElement{
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
