package structuralPatterns.flyweigth;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static final Map<String,Developer> developers= new HashMap<>();
    public Developer getDevBySpecialty(String specialty){
        Developer dev = developers.get(specialty);

        if(dev == null){
            switch (specialty){
                case "java":
                    System.out.println("hiring java dev");
                    dev=new JavaDeveloper();
                    break;
                case "c++":
                    System.out.println("hiring c++ dev");
                    dev=new CppDeveloper();
            }
            developers.put(specialty,dev);
        }
        return dev;
    }
}
