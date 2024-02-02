package behavioral.strategy;

import behavioral.strategy.Coding;
import behavioral.strategy.Developer;
import behavioral.strategy.Reading;
import behavioral.strategy.Sleeping;
import behavioral.strategy.Training;

public class DeveloperRunner {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.setActivity(new Sleeping());
        dev.executeActivity();

        dev.setActivity(new Coding());
        dev.executeActivity();

        dev.setActivity(new Reading());
        dev.executeActivity();

        dev.setActivity(new Training());
        dev.executeActivity();
    }
}
