package factory.factories;

import factory.developers.CppDeveloper;
import factory.developers.Developer;

public class CppDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
