package creationalPatterns.factory.factories;

import creationalPatterns.factory.developers.CppDeveloper;
import creationalPatterns.factory.developers.Developer;

public class CppDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
