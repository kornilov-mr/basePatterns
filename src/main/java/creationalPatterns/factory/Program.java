package creationalPatterns.factory;

import creationalPatterns.factory.factories.CppDeveloperFactory;
import creationalPatterns.factory.factories.DeveloperFactory;
import creationalPatterns.factory.factories.JavaDeveloperFactory;
import creationalPatterns.factory.developers.Developer;

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
