package creationalPatterns.factory.factories;

import creationalPatterns.factory.developers.Developer;
import creationalPatterns.factory.developers.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory{

    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
