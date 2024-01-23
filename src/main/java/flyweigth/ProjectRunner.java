package flyweigth;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory factory = new DeveloperFactory();

        List<Developer> developerList = new ArrayList<>();
        developerList.add(factory.getDevBySpecialty("java"));
        developerList.add(factory.getDevBySpecialty("java"));
        developerList.add(factory.getDevBySpecialty("java"));
        developerList.add(factory.getDevBySpecialty("java"));
        developerList.add(factory.getDevBySpecialty("java"));
        developerList.add(factory.getDevBySpecialty("c++"));
        developerList.add(factory.getDevBySpecialty("c++"));
        developerList.add(factory.getDevBySpecialty("c++"));
        developerList.add(factory.getDevBySpecialty("c++"));
        developerList.add(factory.getDevBySpecialty("c++"));
        developerList.add(factory.getDevBySpecialty("c++"));
        for(Developer developer : developerList){
            developer.writeCode();
        }
    }
}
