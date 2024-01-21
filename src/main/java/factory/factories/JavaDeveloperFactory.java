package factory.factories;

import factory.developers.Developer;
import factory.developers.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory{

    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
