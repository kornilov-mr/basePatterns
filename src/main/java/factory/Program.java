package factory;

import factory.developers.Developer;
import factory.factories.CppDeveloperFactory;
import factory.factories.DeveloperFactory;
import factory.factories.JavaDeveloperFactory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createFactoryBySpecialty("java");
        Developer developer= developerFactory.createDeveloper();
        developer.writeCode();
    }
    private static DeveloperFactory createFactoryBySpecialty(String specialty){
        if(specialty.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        }else if(specialty.equalsIgnoreCase("c++")){
            return new CppDeveloperFactory();
        }else{
            throw new RuntimeException(specialty+ " isn't defined");
        }
    }
}
