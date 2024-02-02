package behavioral.strategy;

import behavioral.strategy.Activity;

public class Training implements Activity {
    @Override
    public void doIt() {
        System.out.println("dev trains...");
    }
}
