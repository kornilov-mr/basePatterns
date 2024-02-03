package behavioral.visitor;

import behavioral.visitor.Developer;

public class DateBase implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);

    }
}
